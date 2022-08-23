package com.sabsrocambole.starwars11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sabsrocambole.starwars11.model.Pessoas;
import com.sabsrocambole.starwars11.service.HTTPService;
import com.sabsrocambole.starwars11.service.buscaFilme;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    String nome;
    String filmes;
    String foto;

    TextView tvTitulo;

    String pessoasID;

    String[] ListaFilmes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent buscarFilmes = new Intent(getApplicationContext(), buscarFilmes.class);
//        startActivity(buscarFilmes);
//
//        ListaFilmes = getIntent().getExtras().getStringArray("valueFilmes");
//        tvTitulo = findViewById(R.id.titulo);
//        tvTitulo.setText(ListaFilmes.toString());

    }


    //carregar
    public void Carregar(View view){
        Intent buscarFilmes = new Intent(getApplicationContext(), buscarFilmes.class);
        startActivity(buscarFilmes);

        ListaFilmes = getIntent().getExtras().getStringArray("valueFilmes");

    }

    //Luke
    public void InfoPage1(View view){

        Intent i = new Intent(getApplicationContext(), infoPage.class);

        pessoasID = "1";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "1" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //C-3PO
    public void InfoPage2(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "2";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", "  + ListaFilmes[4] + ", "  + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "2" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //R2-D2
    public void InfoPage3(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "3";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", "  + ListaFilmes[4] + ", "  + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "3" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Darth Vader
    public void InfoPage4(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "4";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "4" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Leia Organa
    public void InfoPage5(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "5";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "5" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Owen Lars
    public void InfoPage6(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "6";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "6" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Beru Whitesun Lars
    public void InfoPage7(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "7";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ".";
        i.putExtra("Value2",filmes);

        foto = "7" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //R5-D4
    public void InfoPage8(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "8";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ".";
        i.putExtra("Value2",filmes);

        foto = "8" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Biggs Darklighter
    public void InfoPage9(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "9";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ".";
        i.putExtra("Value2",filmes);

        foto = "9" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Obi-Wan Kenobi
    public void InfoPage10(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "10";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", "  + ListaFilmes[4] + ", "  + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "10" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Anakin Skywalker
    public void InfoPage11(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "11";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ", " + ListaFilmes[4] + ", " + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "11" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Wilhuff Tarkin
    public void InfoPage12(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "12";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ", " + ListaFilmes[1] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "12" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Chewbacca
    public void InfoPage13(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "13";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "13" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Han Solo
    public void InfoPage14(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "14";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ".";
        i.putExtra("Value2",filmes);

        foto = "14" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Greedo
    public void InfoPage15(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "15";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ".";
        i.putExtra("Value2",filmes);

        foto = "15" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Jabba Desilijic Tiure
    public void InfoPage16(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "16";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[3] + ", " + ListaFilmes[4] + ".";
        i.putExtra("Value2",filmes);

        foto = "16" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Wedge Antille
    public void InfoPage17(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "17";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ", " + ListaFilmes[2] + ", " + ListaFilmes[3] + ".";
        i.putExtra("Value2",filmes);

        foto = "17" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Jek Tono Porkins
    public void InfoPage18(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "18";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[1] + ".";
        i.putExtra("Value2",filmes);

        foto = "18" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Yoda
    public void InfoPage19(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "19";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[4] + ", " + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "19" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

    //Palpatine
    public void InfoPage20(View view){
        Intent i = new Intent(MainActivity.this, infoPage.class);

        pessoasID = "20";
        try {
            Pessoas retorno = new HTTPService(pessoasID).execute().get();
            nome = retorno.toString();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[4] + ", " + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "20" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }

}