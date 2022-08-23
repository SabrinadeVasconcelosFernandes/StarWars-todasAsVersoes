package com.sabsrocambole.starwars8.service;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.sabsrocambole.starwars8.model.Pessoas;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void, Void, Pessoas> {

    private final String pessoasID;

    public HTTPService(String pessoasID) {
        this.pessoasID = pessoasID;
    }

    @Override
    protected Pessoas doInBackground(Void... voids) {

        //vai abrigar o que o scanner ler da stream url que tem a resposta do sistema -- pega a linha atual e add no stringBuilder
        StringBuilder resposta = new StringBuilder();


        if (this.pessoasID != null) {
            // realizar busca da pessoa:
            try {

                URL url = new URL("https://swapi.dev/api/people/" + this.pessoasID + "/json/");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);
                connection.setConnectTimeout(5000);
                //faz a conexão:
                connection.connect();


                //url.openStream(); --> pega a resposta que o sistema devoleveu e tranforma ela em uma stream.
                //podemos fazer a leitura desse stream através da classe scanner --> new Scanner(url.openStream());
                //enquanto o scanner tiver linhas para serem lidas nós vamos pegar essas linhas e add na nossa resposta --> StringBuilder resposta = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    resposta.append(scanner.next());
                    //com StringBuilder é invocado o método append. Esse método aloca novas strings concatenadas para o mesmo objeto
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new Gson().fromJson(resposta.toString(), Pessoas.class);
    }
}
