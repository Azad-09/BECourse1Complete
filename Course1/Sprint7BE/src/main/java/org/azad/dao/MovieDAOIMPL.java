package org.azad.dao;

import org.azad.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Repository
@Transactional
public class MovieDAOIMPL implements IMovieDAO{

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
    public boolean deleteMovie(int movieID) {
        try
        {
            Movie mobj = this.sessionFactory.getCurrentSession().load(Movie.class, movieID);
            this.sessionFactory.getCurrentSession().delete(mobj);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }


}
