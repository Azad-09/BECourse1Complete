package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
        student count1 = context.getBean("std1",student.class);
        student count2 = context.getBean("std2",student.class);
        System.out.println(count1);
        System.out.println(count2);
    }
}
