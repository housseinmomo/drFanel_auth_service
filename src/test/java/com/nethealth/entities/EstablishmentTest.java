package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.jupiter.api.Test;

class EstablishmentTest {

	@Test
	void testEstablishment() {
		Establishment establishment = new Establishment();
		assertThat(establishment).isNotNull();
		assertThat(establishment).isInstanceOf(Establishment.class);
	}
	

	@Test
	void testEstablishmentStringDateDateStringLocation() {
		Establishment establishment = new Establishment(null,"hopital", new Date(), new Date(), "+221 45 45 45", new Location());
		assertThat(establishment).isNotNull();
		assertThat(establishment).isInstanceOf(Establishment.class);
	}

}
