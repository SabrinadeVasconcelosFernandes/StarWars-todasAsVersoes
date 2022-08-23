package com.sabsrocambole.starwars4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class infoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);

        //TextView nome = findViewById(R.id.txtNome);

        Intent intent =getIntent();
        String txt = intent.getStringExtra("name");
        TextView nomePersonagem =  (TextView) findViewById(R.id.txtNome);
        nomePersonagem.setText(txt);
    }

    public void MainPage(View view){
        Intent irMainPage = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(irMainPage);
    }

}