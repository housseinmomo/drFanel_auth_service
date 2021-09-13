package com.nethealth.entities;

import java.time.LocalDate;

public class Establishment {
	
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String phoneNumber;
	private Location location;
	
	public Establishment() {
		super();
	}

	public Establishment(String name, LocalDate startDate, LocalDate endDate, String phoneNumber, Location location) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.phoneNumber = phoneNumber;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Location getLocation() {
		return location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
	
	
	

}
