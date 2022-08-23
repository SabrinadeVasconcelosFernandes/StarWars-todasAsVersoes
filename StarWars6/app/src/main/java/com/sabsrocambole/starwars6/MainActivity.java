package com.sabsrocambole.starwars6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Button btn;
    String nome;
    String[] ListaFilmes = {"null", "A New Hope", "The Empire Strikes Back", "Return of the Jedi", "The Phantom Menace", "Attack of the Clones", "Revenge of the Sith"};
    String filmes;
    String foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//    public void InfoPage(View view){
//        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
//        startActivity(irInfoPage);
//    }


    //luke
    public void InfoPage1(View view){
        //btn = findViewById(R.id.btnVerInfo1);

        Intent i = new Intent(MainActivity.this, infoPage.class);
        nome = "Luke Skywalker";
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
        nome = "C-3PO";
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
        nome = "R2-D2";
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
        nome = "Darth Vader";
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
        nome = "Leia Organa";
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
        nome = "Owen Lars";
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
        nome = "Beru Whitesun Lars";
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
        nome = "R5-D4";
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
        nome = "Biggs Darklighter";
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
        nome = "Obi-Wan Kenobi";
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
        nome = "Anakin Skywalker";
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
        nome = "Wilhuff Tarkin";
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
        nome = "Chewbacca";
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
        nome = "Han Solo";
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
        nome = "Greedo";
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
        nome = "Jabba Desilijic Tiure";
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
        nome = "Wedge Antille";
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
        nome = "Jek Tono Porkins";
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
        nome = "Yoda";
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
        nome = "Palpatine";
        i.putExtra("Value",nome);

        filmes = "Participou dos filmes:\n" + ListaFilmes[2] + ", " + ListaFilmes[3] + ", " + ListaFilmes[4] + ", " + ListaFilmes[5] + ", " + ListaFilmes[6] + ".";
        i.putExtra("Value2",filmes);

        foto = "20" ;
        i.putExtra("Value3",foto);

        startActivity(i);
        finish();
    }






    //fim de tudo
}