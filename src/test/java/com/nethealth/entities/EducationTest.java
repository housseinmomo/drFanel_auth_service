package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EducationTest {

	@Test
	void testEducation() {
		Education education = new Education();
		assertThat(education).isNotNull();
		assertThat(education).isInstanceOf(Education.class);
	}
	

	@Test
	void testEducationStringStringEstablishment() {
		Education education = new Education("1", "doctorat", new Establishment());
		assertThat(education).isNotNull();
		assertThat(education).isInstanceOf(Education.class);
	}

}
