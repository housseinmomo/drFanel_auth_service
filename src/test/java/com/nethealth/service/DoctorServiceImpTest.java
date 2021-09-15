package com.nethealth.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.nethealth.entities.Doctor;
import com.nethealth.entities.Education;
import com.nethealth.entities.Location;
import com.nethealth.entities.Person;
import com.nethealth.entities.WorkLocation;

@RunWith(SpringRunner.class)
@DataMongoTest
class DoctorServiceImpTest {

	@TestConfiguration
	static class DoctorServiceImpTestConfiguration{
		@Bean
		public DoctorService doctorService(){
			return new DoctorServiceImp();
		}
		
		@Bean
		BCryptPasswordEncoder grtBCE() {
			return new BCryptPasswordEncoder();
		}
		
		
	}
	
	@Autowired
	DoctorService doctorService;
	

	@Test
	void testSaveDoctor() throws Exception {
		List<String > roles = new ArrayList<>();
		Doctor d = new Doctor(null, "bbili", "bbili@gmail.com", "TTili123",
				new Person(null,"mimi", "mimi", new Date(), "female", "+221 47 78 95",
						new Location(null,"Senegal", "dakar", "point e", "98000")), 0,
				new WorkLocation(), new Education(), roles);	
		
		Assert.assertNotNull(doctorService.saveDoctor(d));

	}

}
