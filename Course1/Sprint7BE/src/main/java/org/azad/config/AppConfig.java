package org.azad.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.azad.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class AppConfig {

    @Bean
    public DataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/movie");
        dataSource.setUsername("root");
        dataSource.setPassword("Azad@2923");

        return dataSource;
    }

    @Bean

    public LocalSessionFactoryBean getSessionFactory(DataSource dataSource) throws IOException{
            LocalSessionFactoryBean sessionFactoryBean  = new LocalSessionFactoryBean();

            sessionFactoryBean.setDataSource(dataSource);

        Properties properties = new Properties();
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MYSQL8Dialect");
        properties.put("hibernate.hbm2ddl.auto", "create");

        sessionFactoryBean.setHibernateProperties(properties);
        sessionFactoryBean.setAnnotatedClasses(Movie.class);
        sessionFactoryBean.afterPropertiesSet();;

        return sessionFactoryBean;

    }

    @Bean

    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
    }

}
