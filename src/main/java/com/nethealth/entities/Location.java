package com.nethealth.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor @Data
public class Location {
	
	private String country;
	private String district;
	private String address;
	private String postal_code;

}
