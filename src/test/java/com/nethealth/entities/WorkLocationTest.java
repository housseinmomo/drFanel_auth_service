package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class WorkLocationTest {

	@Test
	void testWorkLocation() {
		WorkLocation workLocation  = new WorkLocation();
		assertThat(workLocation).isNotNull();
		assertThat(workLocation).isInstanceOf(WorkLocation.class);
	}

	@Test
	void testWorkLocationStringEstablishmentTypeOfWorkLocationInt() {
		WorkLocation workLocation  = new WorkLocation("1",new Establishment(), TypeOfWorkLocation.HEALTH_CENTRE);
		assertThat(workLocation).isNotNull();
		assertThat(workLocation).isInstanceOf(WorkLocation.class);
	}

}
