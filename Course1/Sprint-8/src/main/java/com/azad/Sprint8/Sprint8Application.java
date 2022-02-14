package com.azad.Sprint8;

import com.azad.Sprint8.services.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sprint8Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sprint8Application.class, args);
		MyService myObj = context.getBean(MyService.class);
		System.out.println(myObj.service());
	}

}
