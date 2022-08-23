package com.sabsrocambole.starwars8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sabsrocambole.starwars8.model.Pessoas;
import com.sabsrocambole.starwars8.service.HTTPService;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    String nome;
    String filmes;
    String foto;

    String[] ListaNomes;
    String[] ListaFilmes;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void InfoPage(View view){
        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
        startActivity(irInfoPage);
    }

    public void InfoPage1(View view){
        Intent i = new Intent(getApplicationContext(), infoPage.class);
        nome = ListaNomes[1];
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "1" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    public void mudarNome(View view){
        String pessoasID = "1";
        TextView txtNome = findViewById(R.id.txtNome);

        HTTPService service = new HTTPService(pessoasID);
        try {
            Pessoas retorno = service.execute().get();
            txtNome.setText(retorno.toString());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        try {
//            Pessoas retorno = new HTTPService(pessoasID).execute().get();
//            txtNome.setText(retorno.toString());
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}