package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("auth1")
    public Author getAuth1(){
        return new Author(2133, "Khuswant Singh", "khusSingh@gmail.com",getBook1() );
    }

    @Bean("book1")
    public Book getBook1(){
        return new Book("BOKS2133", "The Company Of Women", "Novel");
    }
}
