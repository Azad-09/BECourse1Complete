package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        commuter comObj =(commuter)  applicationContext.getBean("com");
        System.out.println(comObj);
    }
}
