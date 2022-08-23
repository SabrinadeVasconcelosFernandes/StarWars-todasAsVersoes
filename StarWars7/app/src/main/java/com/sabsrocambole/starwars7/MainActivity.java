package com.sabsrocambole.starwars7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

   public void InfoPagePersonagem(View view){
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
}