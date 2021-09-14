package com.nethealth.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor @Data
public class Person {
	
	private String firstname;
	private String lastname;
	private Date dateOfBith;
	private String gender;
	private String phoneNumber;
	private Location location;
	

}
