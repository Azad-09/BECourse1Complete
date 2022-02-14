package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        Product prodObj =(Product)  applicationContext.getBean("prod");
        System.out.println(prodObj);

    }
}
