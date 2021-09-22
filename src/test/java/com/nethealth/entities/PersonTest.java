package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person person  = new Person();
		assertThat(person).isNotNull();
		assertThat(person).isInstanceOf(Person.class);
	}
	

	@Test
	void testPersonStringStringDateStringStringLocation() {
		Person person  = new Person(null, "lili", "lili@gmail.com", "lili","lili", "mimi", new Date(), "male", "+221 14 14 74", new Location(), new ArrayList<>(), 0);
		assertThat(person).isNotNull();
		assertThat(person).isInstanceOf(Person.class);
	}

}
