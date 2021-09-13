package com.nethealth.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "locations")
public class Location {
	@Id
	private String id_location;
	private String country;
	private String district;
	private String street;
	private String postalcode;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Location(String id_location, String country, String district, String street, String postalcode) {
		super();
		this.id_location = id_location;
		this.country = country;
		this.district = district;
		this.street = street;
		this.postalcode = postalcode;
	}
	
	public String getId() {
		return id_location;
	}
	public String getCountry() {
		return country;
	}
	public String getDistrict() {
		return district;
	}
	public String getStreet() {
		return street;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setId(String id) {
		this.id_location = id;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	

}
