package com.springboot.movies.springbootmovies.dto;

public class Movie {

    private String name;
    private String actor;
    private String director;

    public Movie(String name, String actor, String director) {
        this.name = name;
        this.actor = actor;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
