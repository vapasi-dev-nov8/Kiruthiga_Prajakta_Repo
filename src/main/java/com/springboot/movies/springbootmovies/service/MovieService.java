package com.springboot.movies.springbootmovies.service;

import com.springboot.movies.springbootmovies.dto.Movie;
import com.springboot.movies.springbootmovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository)
    {
        this.movieRepository=movieRepository;
    }

    public List<Movie> getMovies()
    {
        return movieRepository.getMovieList();
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.saveMovie(movie);
    }
}
