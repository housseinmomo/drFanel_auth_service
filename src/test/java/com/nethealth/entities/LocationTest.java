package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LocationTest {

	@Test
	void testLocation() {
		Location l = new Location();
		assertThat(l).isNotNull();
		assertThat(l).isInstanceOf(Location.class);
	}

	@Test
	void testLocationStringStringStringStringString() {
		Location l = new Location("1","senegal","dakar","point e","9847");
		assertThat(l).isNotNull();
		assertThat(l).isInstanceOf(Location.class);
	}

	@Test
	void testGetId() {
		Location l = new Location("1","senegal","dakar","point e","9847");
		assertThat(l.getId()).isEqualTo("1");
	}

	@Test
	void testGetCountry() {
		Location l = new Location("1","senegal","dakar","point e","9847");
		assertThat(l.getCountry()).isEqualTo("senegal");
	}

	@Test
	void testGetDistrict() {
		Location l = new Location("1","senegal","dakar","point e","9847");
		assertThat(l.getDistrict()).isEqualTo("dakar");
	}

	@Test
	void testGetStreet() {
		Location l = new Location("1","senegal","dakar","point e","9847");
		assertThat(l.getStreet()).isEqualTo("point e");
	}

	@Test
	void testGetPostalcode() {
		Location l = new Location("1","senegal","dakar","point e","9847");
		assertThat(l.getPostalcode()).isEqualTo("9847");
	}

	@Test
	void testSetId() {
		Location l = new Location();
		l.setId("2");
		assertThat(l.getId()).isEqualTo("2");
	}

	@Test
	void testSetCountry() {
		Location l = new Location();
		l.setCountry("senegal");
		assertThat(l.getCountry()).isEqualTo("senegal");
	}

	@Test
	void testSetDistrict() {
		Location l = new Location();
		l.setDistrict("dakar");
		assertThat(l.getDistrict()).isEqualTo("dakar");
	}

	@Test
	void testSetStreet() {
		Location l = new Location();
		l.setStreet("point e");
		assertThat(l.getStreet()).isEqualTo("point e");
	}

	@Test
	void testSetPostalcode() {
		Location l = new Location();
		l.setPostalcode("9847");
		assertThat(l.getPostalcode()).isEqualTo("9847");
	}

}
