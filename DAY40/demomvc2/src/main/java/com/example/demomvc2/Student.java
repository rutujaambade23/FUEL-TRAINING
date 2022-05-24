package com.example.demomvc2;
import java.util.ArrayList;

public class Student {
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String plang;
	ArrayList<String>os=new ArrayList<String>();
	ArrayList<String>city=new ArrayList<String>();
	
	
	public ArrayList<String> getCity() {
		return city;
	}
	public void setCity(ArrayList<String> city) {
		this.city = city;
	}
	
	
	public ArrayList<String> getOs() {
		return os;
	}
	public void setOs(ArrayList<String> os) {
		this.os = os;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlang() {
		return plang;
	}
	public void setPlang(String plang) {
		this.plang = plang;
	}
    
	
	
}	