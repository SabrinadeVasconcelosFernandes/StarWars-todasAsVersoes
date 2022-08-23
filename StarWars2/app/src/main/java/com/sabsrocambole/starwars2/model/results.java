package com.sabsrocambole.starwars2.model;

public class results {
    private String name;
    private String films;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }
//    @Override
//    public String toString() {
//        return "results{" +
//                "name='" + name + '\'' +
//                ", films='" + films + '\'' +
//                '}';
//    }
    @Override
    public String toString() {
        return "results: " +
                "name: " + getName() + '\'' +
                ", films: " + getFilms() + '\'' ;
    }
}
