package com.example.demoweb2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello from Spring Boot";
	
	}
     @GetMapping("/hello")
     public String getMsg() {
    	 return "Hello World";
     }
     
}
     
    
