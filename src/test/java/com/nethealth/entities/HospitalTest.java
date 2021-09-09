package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HospitalTest {

	@Test
	void testHospital() {
		Hospital h = new Hospital();
		assertThat(h).isNotNull();
		assertThat(h).isInstanceOf(Hospital.class);
	}

	@Test
	void testHospitalStringEstablishment() {
		Hospital h = new Hospital("1", new Establishment());
		assertThat(h).isNotNull();
		assertThat(h).isInstanceOf(Hospital.class);
	}

	@Test
	void testGetId_hospital() {
		Hospital h = new Hospital("1", new Establishment());
		assertThat(h.getId_hospital()).isEqualTo("1");
	}

	@Test
	void testSetId_hospital() {
		Hospital h = new Hospital();
		h.setId_hospital("1");
		assertThat(h.getId_hospital()).isEqualTo("1");
	}

	@Test
	void testGetEstablishment_hospital() {
		Establishment e = new Establishment();
		Hospital h = new Hospital("1", e);
		assertThat(h.getEstablishment_hospital()).isEqualTo(e);
	}

	@Test
	void testSetEstablishment_hospital() {
		Establishment e = new Establishment();
		Hospital h = new Hospital();
		h.setEstablishment_hospital(e);
		assertThat(h.getEstablishment_hospital()).isEqualTo(e);
	}

}
