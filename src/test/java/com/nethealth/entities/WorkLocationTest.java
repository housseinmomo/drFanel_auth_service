package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class WorkLocationTest {

	@Test
	void testWorkLocation() {
		WorkLocation wl  = new WorkLocation();
		assertThat(wl).isNotNull();
		assertThat(wl).isInstanceOf(WorkLocation.class);
	}

	@Test
	void testWorkLocationStringEstablishmentTypeOfWorkLocationInt() {
		WorkLocation wl  = new WorkLocation("1",new Establishment(), TypeOfWorkLocation.HEALTH_CENTRE);
		assertThat(wl).isNotNull();
		assertThat(wl).isInstanceOf(WorkLocation.class);
	}

}
