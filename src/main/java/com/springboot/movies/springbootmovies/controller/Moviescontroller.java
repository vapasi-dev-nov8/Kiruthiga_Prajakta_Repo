package com.springboot.movies.springbootmovies.controller;

import com.springboot.movies.springbootmovies.dto.Movie;
import com.springboot.movies.springbootmovies.repository.MovieRepository;
import com.springboot.movies.springbootmovies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/movies")

public class Moviescontroller {

    private MovieService movieService;

    @Autowired
    public Moviescontroller(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/")
    public ResponseEntity<List<Movie>> getMovieList() {
        List<Movie> movieList = movieService.getMovies();
        return ResponseEntity.ok().body(movieList);
    }

    @PostMapping("/")

    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        Movie responseMovie = movieService.saveMovie(movie);
        return new ResponseEntity<Movie>(responseMovie, HttpStatus.CREATED);

    }
}
