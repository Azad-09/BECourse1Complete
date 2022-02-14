package org.movie.repositary;

import org.movie.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepo {
    public List<Movie> moviedata;

    public MovieRepo()
    {
        this.moviedata = new ArrayList();
    }

    public List<Movie> getMoviedata()
    {
        return moviedata;
    }

    public void setMoviedata(List<Movie> moviedata)
    {
        this.moviedata = moviedata;
    }

    public void addMovie(Movie news)
    {
        this.moviedata.add(news);
    }

    public void deleteMovie(int newsId)
    {
        this.moviedata.remove(newsId);
    }

    public void updateMovie(Movie movie)
    {
        this.moviedata.add(movie);
    }
}
