package org.example;

import org.example.model.Book;
import org.example.util.Hibernateutil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory= Hibernateutil.getSessionFactory();
        Session session=sessionFactory.openSession();
        System.out.println("Session open: "+session.isOpen());
        Book book = new Book();
        book.setBookName("Death");
        book.setAuthorName("SadhGuru");
        book.setEditorName("Rajacharii");
        book.setCost(420);
        Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
        System.out.println("inserted successfully");

    }
}
