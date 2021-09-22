package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LocationTest {

	@Test
	void testLocation() {
		Location location = new Location();
		assertThat(location).isNotNull();
		assertThat(location).isInstanceOf(Location.class);
	}

	@Test
	void testLocationStringStringStringString() {
		Location location = new Location(null,"senegal", "dakar", "point e", "98600");
		assertThat(location).isNotNull();
		assertThat(location).isInstanceOf(Location.class);
	}

}
