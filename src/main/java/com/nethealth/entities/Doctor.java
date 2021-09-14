package com.nethealth.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor @Data 
@Document(collection = "doctors")
public class Doctor {
	@Id
	private String id_doctor;
	private String username;
	private String email;
	private String password;
	private Person person;
	private int status;
	private WorkLocation location_name;
	private Education training;
	private List<String> roles;

}
