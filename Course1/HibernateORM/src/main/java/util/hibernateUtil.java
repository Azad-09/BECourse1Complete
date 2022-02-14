package util;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;


import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class hibernateUtil {
private static ServiceRegistry srObj ;
private static SessionFactory sfObj ;

public static SessionFactory getSfObj(){
    try{
        Configuration cfgObj = new Configuration();
        cfgObj.configure("hibernate.cfg.xml");
        srObj = new StandardServiceRegistryBuilder().applySettings(cfgObj.getProperties()).build();
        sfObj = cfgObj.buildSessionFactory(srObj);
    }catch (HibernateException he){
        System.out.println(he);
        System.out.println("There is an Exception");
    }
    return sfObj;
}


}
