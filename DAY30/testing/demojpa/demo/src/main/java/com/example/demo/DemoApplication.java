package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context = SpringApplication.run(DemoApplication.class, args);
		StudentRepository stud = context.getBean(StudentRepository.class);
		// create row
		// Student st = new Student(100,"abc");
		// stud.save(st);
		// System.out.println("Record saved");

		  Optional<Student> op;
		  op=stud.findById(400);
		  Student st2=op.get();
		  System.out.println(st2.getId());
		  System.out.println(st2.getName());
		  st2.setName("demo123");
		  stud.save(st2);

		

		
	       // delete
		// Optional<Student> op = stud.findById(300);
		//  Student st2 = op.get();
		//  System.out.println(st2.getId());
		//  System.out.println(st2.getName());
		//  st2.setName("demo123");
		//  stud.save(st2);

		// List<Student> studlist;
		// studlist = stud.findAll();

		// for (Student st3 : studlist) {
		// 	System.out.println(st3.getId());
		// 	System.out.println(st3.getName());
		}

	}

