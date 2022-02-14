package com.stackroute.springmvc.dao.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.stackroute.springmvc.dao.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class MovieDAOImpl implements IMovieDAO
{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveMovie(Movie movie) {
		try
		{
			this.sessionFactory.getCurrentSession().save(movie);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Movie> getAllMovie() {
		return this.sessionFactory.getCurrentSession().createQuery("from Movie").list();
	}

	@Override
	public boolean deleteMovie(String MovieID) {
		try
		{
			Movie nObj = this.sessionFactory.getCurrentSession().load(Movie.class, MovieID);
			this.sessionFactory.getCurrentSession().delete(nObj);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
