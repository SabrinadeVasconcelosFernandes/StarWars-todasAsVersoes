package com.sabsrocambole.starwars7.model;

public class Pessoas {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nome do personagem: " + getName();
    }
}
