package org.azad.dao;

import org.azad.model.Movie;

import java.util.List;

public interface IMovieDAO {

    public boolean saveMovie(Movie movie);
    public List<Movie> getAllMovie();
    public boolean deleteMovie(int movieID);
}
