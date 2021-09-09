package com.nethealth.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trainings")
public class Training{
	
	private String id_training;
	private String degree;
	private Establishment establishment;
	
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Training(String id_training, String degree, Establishment establishment) {
		super();
		this.id_training = id_training;
		this.degree = degree;
		this.establishment = establishment;
	}

	public String getId_training() {
		return id_training;
	}

	public void setId_training(String id_training) {
		this.id_training = id_training;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}
	
	
	
	
	
	

}
