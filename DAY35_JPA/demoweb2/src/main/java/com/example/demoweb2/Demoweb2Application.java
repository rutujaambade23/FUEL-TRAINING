package com.example.demoweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demoweb2Application {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(Demoweb2Application.class, args);
		StudentDeatails std;
		std=context.getBean(StudentDeatails.class);
		std.setdata();
		std.showdata();
		
		
	}

}

