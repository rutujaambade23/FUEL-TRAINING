package com.example.demoassignmethttpmethods;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController{
	@Autowired
	private EmployeeRepository emp;
	
	@GetMapping("/employee")

public List<Employee>getAllEmployees(){
		return emp.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getStudentById(@PathVariable("id") Integer studId) {
		Optional<Employee> op = emp.findById(studId);
		Employee st = op.get();
	    return st;
	}
	@PostMapping("/save")
	public Employee createStudent(@RequestBody Employee st) {
		return emp.save(st);
	}
     
	@PutMapping("/updateEmployee/{id}")
	public boolean updateEmployee(@PathVariable(value = "id") Integer empId,
			@RequestBody Employee studDetails) throws Exception {
		boolean f=true;
		try {
			Optional<Employee> op = emp.findById(empId);
			Employee st = op.get();
			st.setName(studDetails.getName());
			final Employee updatedEmp = emp.save(st);
		} catch(Exception e) {
			f=false;
		}
		return f;
	}
    
	@DeleteMapping("/deleteEmployee/{id}")
	public boolean deleteEmployee(@PathVariable(value = "id") Integer empId,
			@RequestBody Employee studDetails) throws Exception {
		Optional<Employee> op = emp.findById(empId);
		Employee em = op.get();
		 
		emp.delete(em);
		return true;
	}
	

	
}
	
