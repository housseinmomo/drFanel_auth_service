package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

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
		Doctor d = new Doctor("1", new Person(), new WorkLocation(),
				new Education());
		
		assertThat(d).isNotNull();
		assertThat(d).isInstanceOf(Doctor.class);
	}

}
