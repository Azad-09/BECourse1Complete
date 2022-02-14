package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Author authObj = context.getBean("auth1", Author.class);
        Book bookObj = context.getBean("book1",Book.class);
        System.out.println(authObj);
        System.out.println(bookObj);
    }
}
