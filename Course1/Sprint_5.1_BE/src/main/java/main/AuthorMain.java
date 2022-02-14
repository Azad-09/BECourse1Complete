package main;

import dao.AuthorDAO;
import model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.Hibernateutil;

public class AuthorMain {
    private static SessionFactory sessionFactory;
    private static Session session;
    public static void main(String[] args) {
        sessionFactory= Hibernateutil.getSessionFactory();
        session=sessionFactory.openSession();
        System.out.println("Session open: "+session.isOpen());
        //
        AuthorDAO authorDAO=new AuthorDAO();
        Author author=new Author();
        author.setAuthName("Amish Tripathy");
        author.setBookName("Shiva Trilogy");
        author.setCost(420);
        //
        System.out.println("inserted successfully");
    }
}
