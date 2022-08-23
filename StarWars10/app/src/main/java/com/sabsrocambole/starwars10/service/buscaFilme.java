package com.sabsrocambole.starwars10.service;

import com.sabsrocambole.starwars10.model.Filmes;

import java.util.concurrent.ExecutionException;

import androidx.appcompat.app.AppCompatActivity;

public class buscaFilme extends AppCompatActivity {
    String filmesID;

    String[] ListaFilmes;
    String filme1;
    String filme2;
    String filme3;
    String filme4;
    String filme5;
    String filme6;

    public String[] buscarFilme(){
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

        return ListaFilmes;
    }

}
