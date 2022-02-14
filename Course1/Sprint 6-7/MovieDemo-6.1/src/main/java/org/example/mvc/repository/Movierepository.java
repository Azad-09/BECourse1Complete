package org.example.mvc.repository;

import org.example.mvc.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class Movierepository {

        public List<Movie> moviedata;

        public Movierepository()
        {
            this.moviedata = new ArrayList();
        }

        public List<Movie> getMovieData()
        {
            return moviedata;
        }

        public void setMovie(List<Movie> moviedata)
        {
            this.moviedata = moviedata;
        }

        public void addMovie(Movie movie)
        {
            this.moviedata.add(movie);
        }

        public void deleteMovie(int MovieID)
        {
            this.moviedata.remove(MovieID);
        }

        public void updateMovie(Movie movie)
        {
            this.moviedata.add(movie);
        }
    }

