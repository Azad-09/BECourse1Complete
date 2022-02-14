package dao;

import model.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.Hibernateutil;

public class AuthorDAO {
    public boolean saveAuthor(Author author) {
        try {
            Session session = Hibernateutil.getSessionFactory().openSession();
            Transaction transaction = session.getTransaction();
            transaction = session.beginTransaction();
            session.save(author);
            // session.update(user);
            // session.delete(user);
            transaction.commit();
            return true;
        }
        catch(Exception e)
        {            e.printStackTrace();
            return false;
        }
    }
}
