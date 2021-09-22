package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DoctorTest {

	@Test
	void testDoctor() {
		Doctor doctor = new Doctor();
		assertThat(doctor).isNotNull();
		assertThat(doctor).isInstanceOf(Doctor.class);
	}
	

	@Test
	void testDoctorStringStringStringStringPersonIntWorkLocationEducationListOfString() {
		Doctor doctor = new Doctor("1", new Person(), new WorkLocation(),
				new Education());
		
		assertThat(doctor).isNotNull();
		assertThat(doctor).isInstanceOf(Doctor.class);
	}

}
