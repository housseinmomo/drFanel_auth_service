package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PatientTest {

	@Test
	void testPatient() {
		Patient patient = new Patient();
		assertThat(patient).isNotNull();
		assertThat(patient).isInstanceOf(Patient.class);
	}

	@Test
	void testPatientStringPerson() {
		Patient patient = new Patient("1", new Person());
		assertThat(patient).isNotNull();
		assertThat(patient).isInstanceOf(Patient.class);
	}

}
