package com.nethealth.entities;

import java.time.LocalDate;


public class Person {
	
	
	
	private String firstname;
	private String lastname;
	private LocalDate dateOfBith;
	private String gender;
	private String email;
	private String password;
	private String phoneNumber;
	private String role;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String firstname, String lastname, LocalDate dateOfBith, String gender, String email, String password,
			String phoneNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBith = dateOfBith;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;

	}
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getRole() {
		return role;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public LocalDate getDateOfBith() {
		return dateOfBith;
	}
	public void setDateOfBith(LocalDate dateOfBith) {
		this.dateOfBith = dateOfBith;
	}
	
	

}
