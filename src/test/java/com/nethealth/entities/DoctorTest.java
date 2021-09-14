package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	void testDoctor() {
		Doctor d = new Doctor();
		assertThat(d).isNotNull();
		assertThat(d).isInstanceOf(Doctor.class);
	}
	

	@Test
	void testDoctorStringStringStringStringPersonIntWorkLocationEducationListOfString() {
		Doctor d = new Doctor("1", "lili", "lili@gmail.com", "lili", new Person(), 0, new WorkLocation(),
				new Education(), new ArrayList<>());
		
		assertThat(d).isNotNull();
		assertThat(d).isInstanceOf(Doctor.class);
	}

}
