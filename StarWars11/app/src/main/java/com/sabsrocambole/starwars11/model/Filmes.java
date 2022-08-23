package com.sabsrocambole.starwars11.model;

public class Filmes {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title ;
    }
}