package com.nethealth.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hospitals")
public class Hospital {
	
	@Id
	private String id_hospital;
	private Establishment Establishment_hospital;
	
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String id_hospital, Establishment establishment_hospital) {
		super();
		this.id_hospital = id_hospital;
		Establishment_hospital = establishment_hospital;
	}

	public String getId_hospital() {
		return id_hospital;
	}
	
	public void setId_hospital(String id_hospital) {
		this.id_hospital = id_hospital;
	}

	public Establishment getEstablishment_hospital() {
		return Establishment_hospital;
	}

	public void setEstablishment_hospital(Establishment establishment_hospital) {
		Establishment_hospital = establishment_hospital;
	}
	
	
	

}
