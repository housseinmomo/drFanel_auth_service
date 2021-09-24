package com.nethealth.repository;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nethealth.entities.Doctor;
import com.nethealth.entities.Education;
import com.nethealth.entities.Location;
import com.nethealth.entities.Person;
import com.nethealth.entities.WorkLocation;

@RunWith(SpringRunner.class)
@DataMongoTest
class DoctorRepositoryTest {

	@Autowired
	DoctorRepository doctorRepository;

	@Test
	void testFindByPersonEmail() {
		Person person  = new Person(null, "lili", "millienne@gmail.com", "lili","lili", "mimi", new Date(), "male", "+221 14 14 74", new Location(), new ArrayList<>(), 0);
		Doctor doctor = new Doctor(null, person, new WorkLocation(),
				new Education());
		doctorRepository.save(doctor);
		Assert.assertNotNull(doctorRepository.findByPersonEmail("millienne@gmail.com"));

	}

	@Test
	void testFindByPersonUsername() {
		Person person  = new Person(null, "melanine", "melanine@gmail.com", "lili","lili", "mimi", new Date(), "male", "+221 14 14 74", new Location(), new ArrayList<>(), 0);
		Doctor doctor = new Doctor(null, person, new WorkLocation(),
				new Education());
		doctorRepository.save(doctor);
		Assert.assertNotNull(doctorRepository.findByPersonUsername("melanine"));
		 

	}

}
