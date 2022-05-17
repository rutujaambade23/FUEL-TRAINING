package com.example.demoweb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDeatails {
	private Student stud;
	
	@Autowired
	
     public StudentDeatails(Student stud) {
		super();
		this.stud = stud;
	}
	
	  void setdata() {
	    	 stud.setId(100);
	    	 stud.setName("RUTUJA");
	     }
	void showdata() {
    	 System.out.println(stud.getId());
    	 System.out.println(stud.getName());
     }

}

