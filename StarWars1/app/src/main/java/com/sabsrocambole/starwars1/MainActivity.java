package com.sabsrocambole.starwars1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void InfoPage(View view){
        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
        startActivity(irInfoPage);
    }
}