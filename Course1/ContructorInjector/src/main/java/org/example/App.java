package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args) {
            ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
            customer custObj =(customer)  applicationContext.getBean("cust");
            System.out.println(custObj);


        }

    }
