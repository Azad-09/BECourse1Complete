package org.example.util;


import org.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

public class Hibernateutil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        try {
            Properties properties = new Properties();
            Configuration configuration = new Configuration();
            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/Wave14");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "Azad@2923");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            //Setting Properties inside the configuration
            configuration.setProperties(properties);
            //Giving the Mapping Path by describing the Annotated POJO Class
            configuration.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
