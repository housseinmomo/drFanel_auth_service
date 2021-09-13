package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TrainingTest {

	@Test
	void testTraining() {
		Training t = new Training();
		assertThat(t).isNotNull();
		assertThat(t).isInstanceOf(Training.class);
	}

	@Test
	void testTrainingStringStringEstablishment() {
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", new Location());
		Training t = new Training("1","doctorat",e);
		assertThat(t).isNotNull();
		assertThat(t).isInstanceOf(Training.class);
	}

	@Test
	void testGetId_training() {
		Training t = new Training("1","doctorat",new Establishment());
		assertThat(t.getId_training()).isEqualTo("1");
	}

	@Test
	void testSetId_training() {
		Training t = new Training();
		t.setId_training("1");
		assertThat(t.getId_training()).isEqualTo("1");
	}

	@Test
	void testGetDegree() {
		Training t = new Training("1","doctorat",new Establishment());
		assertThat(t.getDegree()).isEqualTo("doctorat");
	}

	@Test
	void testSetDegree() {
		Training t = new Training();
		t.setDegree("doctorat");
		assertThat(t.getDegree()).isEqualTo("doctorat");
	}

	@Test
	void testGetEstablishment() {
		Establishment e = new Establishment();
		Training t = new Training("1","doctorat",e);
		assertThat(t.getEstablishment()).isNotNull();
		assertThat(t.getEstablishment()).isEqualTo(e);
	}

	@Test
	void testSetEstablishment() {
		Establishment e = new Establishment();
		Training t = new Training();
		t.setEstablishment(e);
		assertThat(t.getEstablishment()).isNotNull();
		assertThat(t.getEstablishment()).isEqualTo(e);
	}

}
