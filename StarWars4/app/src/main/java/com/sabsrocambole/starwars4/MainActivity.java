package com.sabsrocambole.starwars4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

String nome = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void InfoPage(View view){
        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
        irInfoPage.putExtra("nome",nome);
        startActivity(irInfoPage);
    }

    //luke
    public void InfoPage1(View view){

        nome = "Luke";

        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
        irInfoPage.putExtra("nome",nome);
        startActivity(irInfoPage);
    }
}