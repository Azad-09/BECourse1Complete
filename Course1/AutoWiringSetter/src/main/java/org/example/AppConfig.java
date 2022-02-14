package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("cust1")

    public Customer getCust1(){
        return new Customer(101, "Pinky", "9437254829", "pinky@hotmail.com", getAdd1());
    }

    @Bean("add1")

    public  Address getAdd1(){
        return new Address("15/C Modern Colony", "Kanpur", "UP", 772314, "India");
    }
}
