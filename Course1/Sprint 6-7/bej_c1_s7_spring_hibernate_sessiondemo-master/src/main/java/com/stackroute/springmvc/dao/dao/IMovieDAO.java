package com.stackroute.springmvc.dao.dao;

import java.util.List;

import com.stackroute.springmvc.dao.model.Movie;

public interface IMovieDAO
{
	 boolean saveMovie(Movie movie);
	
	 List<Movie> getAllMovie();
	
	 boolean deleteMovie(String MovieID);

}
