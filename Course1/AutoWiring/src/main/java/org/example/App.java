package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Customer custObj = context.getBean("cust1",Customer.class);
        System.out.println(custObj);
    }
}
