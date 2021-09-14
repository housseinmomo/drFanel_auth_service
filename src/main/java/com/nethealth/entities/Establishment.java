package com.nethealth.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
public class Establishment {
	
	private String name;
	private Date startDate;
	private Date endDate;
	private String phoneNumber;
	private Location location;

}
