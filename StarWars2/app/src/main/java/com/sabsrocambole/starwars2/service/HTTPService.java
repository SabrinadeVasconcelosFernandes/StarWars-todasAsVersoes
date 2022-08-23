package com.sabsrocambole.starwars2.service;

import android.os.AsyncTask;

import com.sabsrocambole.starwars2.model.results;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPService extends AsyncTask<Void, Void, results> {

    private final String name;

    public HTTPService(String name) {
        this.name = name;
    }

    @Override
    protected results doInBackground(Void... voids) {
        try {
           URL url = new URL("https://swapi.dev/api/people/"+name+"?format=json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
