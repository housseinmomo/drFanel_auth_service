package com.nethealth.repository;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nethealth.entities.Doctor;
import com.nethealth.entities.Education;
import com.nethealth.entities.Person;
import com.nethealth.entities.WorkLocation;

@RunWith(SpringRunner.class)
@DataMongoTest
class DoctorRepositoryTest {

	@Autowired
	DoctorRepository doctorRepository;

	@Test
	void testFindByEmail() {
		Doctor d = new Doctor(null, "tili", "tili@gmail.com", "tili", new Person(), 0, new WorkLocation(),
				new Education(), new ArrayList<String>());
		doctorRepository.save(d);
		 Assert.assertNotNull(doctorRepository.findByEmail("tili@gmail.com"));

	}

	@Test
	void testFindByUsername() {
		Doctor d = new Doctor(null, "mili", "mili@gmail.com", "mili", new Person(), 0, new WorkLocation(),
				new Education(), new ArrayList<String>());
		doctorRepository.save(d);
		 Assert.assertNotNull(doctorRepository.findByUsername("mili"));
		 

	}

}
