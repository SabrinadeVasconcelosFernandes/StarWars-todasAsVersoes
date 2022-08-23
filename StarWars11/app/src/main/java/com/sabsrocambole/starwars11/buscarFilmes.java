package com.sabsrocambole.starwars11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sabsrocambole.starwars11.model.Filmes;
import com.sabsrocambole.starwars11.service.HTTPServiceFilmes;

import java.util.concurrent.ExecutionException;

public class buscarFilmes extends AppCompatActivity {

    String filmesID;

    String[] ListaFilmes;
    String filme1;
    String filme2;
    String filme3;
    String filme4;
    String filme5;
    String filme6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_filmes);
        //Filmes
        filmesID = "1";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme1 = retorno.toString();
        } catch (
                ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        filmesID = "2";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme2 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        filmesID = "3";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme3 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        filmesID = "4";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme4 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        filmesID = "5";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme5 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        filmesID = "6";
        try {
            Filmes retorno = new HTTPServiceFilmes(filmesID).execute().get();
            filme6 = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ListaFilmes = new String[]{"null", filme1, filme2, filme3, filme4, filme5, filme6};

        //Fim Filmes
    }

    public void MainPage(View view){
        Intent irMainPage = new Intent(getApplicationContext(), MainActivity.class);
        irMainPage.putExtra("valueFilmes",ListaFilmes);
        startActivity(irMainPage);
    }
}