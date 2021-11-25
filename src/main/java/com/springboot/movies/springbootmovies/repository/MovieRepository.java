package com.springboot.movies.springbootmovies.repository;

import com.springboot.movies.springbootmovies.dto.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MovieRepository {

   List<Movie> movieList =new ArrayList<Movie>(Arrays.asList
    (new Movie(1, "BahuBali","Prabhas","Raja Mouli"),
      new Movie(2, "3 Idiots","Amir Khan","RajKumar Hirani"),
       new Movie(3, "BahuBali","Prabhas","Raja Mouli"),
       new Movie(4, "BahuBali 2","Prabhas","Raja Mouli"),
       new Movie(5, "Jai Bheem","Suriya","Ganavel")));

   public List<Movie> getMovieList()
   {
       return  movieList;
   }
public Movie saveMovie(Movie movie)
{
    int newId=movieList.get(movieList.size()-1).getId()+1;
    Movie movieToBeSaved = new Movie(newId, movie.getName(),
            movie.getActor(), movie.getDirector());
    movieList.add(movieToBeSaved);
    return movieToBeSaved;
}
}
