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
	void testLocationStringStringStringString() {
		Location l = new Location(null,"senegal", "dakar", "point e", "98600");
		assertThat(l).isNotNull();
		assertThat(l).isInstanceOf(Location.class);
	}

}
