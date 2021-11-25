package com.springboot.movies.springbootmovies.repository;

import com.springboot.movies.springbootmovies.dto.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

   List<Movie> movieList =new ArrayList<>();

   public List<Movie> getMovieList()
   {
       movieList.add(new Movie("BahuBali","Prabhas","Raja Mouli"));
       movieList.add(new Movie("3 Idiots","Amir Khan","RajKumar Hirani"));
       movieList.add(new Movie("BahuBali","Prabhas","Raja Mouli"));
       movieList.add(new Movie("BahuBali 2","Prabhas","Raja Mouli"));
       movieList.add(new Movie("Jai Bheem","Suriya","Ganavel"));
       return  movieList;
   }

}
