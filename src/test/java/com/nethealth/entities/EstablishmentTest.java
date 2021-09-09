package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EstablishmentTest {

	@Test
	void testEstablishment() {
		Establishment e = new Establishment();
		assertThat(e).isNotNull();
		assertThat(e).isInstanceOf(Establishment.class);
	}

	@Test
	void testEstablishmentStringLocalDateLocalDateStringLocation() {
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", new Location());
		assertThat(e).isNotNull();
		assertThat(e).isInstanceOf(Establishment.class);
	}

	@Test
	void testGetName() {
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", new Location());
		assertThat(e.getName()).isEqualTo("ecole");
	}

	@Test
	void testGetStartDate() {
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", new Location());
		assertThat(e.getStartDate()).isEqualTo("2020-04-30");
	}

	@Test
	void testGetEndDate() {
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", new Location());
		assertThat(e.getEndDate()).isEqualTo("2020-05-30");
	}

	@Test
	void testGetPhoneNumber() {
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", new Location());
		assertThat(e.getLocation()).isNotNull();
	}

	@Test
	void testGetLocation() {
		Location l = new Location();
		Establishment e = new Establishment("ecole", LocalDate.parse("2020-04-30"), LocalDate.parse("2020-05-30"),
				"547894", l);
		assertThat(e.getLocation()).isEqualTo(l);
	}

	@Test
	void testSetName() {
		Establishment e = new Establishment();
		e.setName("ecole");
		assertThat(e.getName()).isEqualTo("ecole");
	}

	@Test
	void testSetStartDate() {
		Establishment e = new Establishment();
		e.setStartDate(LocalDate.parse("2020-04-30"));
		assertThat(e.getStartDate()).isEqualTo("2020-04-30");
	}

	@Test
	void testSetEndDate() {
		Establishment e = new Establishment();
		e.setEndDate(LocalDate.parse("2020-05-30"));
		assertThat(e.getEndDate()).isEqualTo("2020-05-30");
	}

	@Test
	void testSetPhoneNumber() {
		Establishment e = new Establishment();
		e.setPhoneNumber("547894");
		assertThat(e.getPhoneNumber()).isEqualTo("547894");
	}

	@Test
	void testSetLocation() {
		Location l = new Location();
		Establishment e = new Establishment();
		e.setLocation(l);
		assertThat(e.getLocation()).isEqualTo(l);

	}

}
