package com.sabsrocambole.starwars5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String value = "sa";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void InfoPage(View view){
        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
        irInfoPage.putExtra("nome",value);
        startActivity(irInfoPage);
    }

    //luke
    public void InfoPage1(View view){

        value = "Luke";

        Intent irInfoPage = new Intent(getApplicationContext(), infoPage.class);
        irInfoPage.putExtra("nome",value);
        startActivity(irInfoPage);
    }
}