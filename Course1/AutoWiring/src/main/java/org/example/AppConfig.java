package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("cust1")
    public  Customer getCust1(){
        return  new Customer(101,"Happu", 93373100, "happu@gmail.com" ,getAdd1() );
    }

    @Bean("add1")
    public  Address getAdd1(){
        return new Address("11/B", "Cuttack","Odisha", 753014);
    }
}
