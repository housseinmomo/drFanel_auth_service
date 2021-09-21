package com.nethealth.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor @Data
@Document(collection = "persons")
public class Person {
	@Id
	private String id;
	private String username;
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private Date dateOfBith;
	private String gender;
	private String phoneNumber;
	private Location location;
	private List<String> roles;
	private int status;
	

}
