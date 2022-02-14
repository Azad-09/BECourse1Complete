package org.example;

import org.example.model.User;
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
        User user = new User();
        user.setUsername("Aish");
        user.setEmail("aish@axis.com");
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        System.out.println("inserted successfully");

    }
}
