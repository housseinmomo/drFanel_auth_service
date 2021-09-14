package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EducationTest {

	@Test
	void testEducation() {
		Education e = new Education();
		assertThat(e).isNotNull();
		assertThat(e).isInstanceOf(Education.class);
	}
	

	@Test
	void testEducationStringStringEstablishment() {
		Education e = new Education("1", "doctorat", new Establishment());
		assertThat(e).isNotNull();
		assertThat(e).isInstanceOf(Education.class);
	}

}
