package com.sabsrocambole.starwars1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class infoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
    }

    public void MainPage(View view){
        Intent irMainPage = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irMainPage);
    }

    public void InfoPage(View view) {
    }
}