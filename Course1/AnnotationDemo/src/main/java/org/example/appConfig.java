package org.example;

import org.springframework.context.annotation.Bean;
import  org.example.student;
public class appConfig {

    @Bean("std1")

    public student getStd1(){
        return new student(11, "Rajesh", 4);
    }

    @Bean("std2")

    public  student getStd2(){
        return new student(12, "Pinky", 5);
    }

}
