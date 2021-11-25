package com.springboot.movies.springbootmovies.dto;

public class Movie {
    private int id;
    private String name;
    private String actor;
    private String director;

    public Movie(int Id, String name, String actor, String director) {
        this.id= Id;
        this.name = name;
        this.actor = actor;
        this.director = director;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getActor() {
        return actor;
    }

    public String getDirector() {
        return director;
    }
}
