package util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
    private static SessionFactory sessionFactory=null;
    public static SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory=configuration.buildSessionFactory();
        } catch (HibernateException e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
        return sessionFactory;
    }
}
