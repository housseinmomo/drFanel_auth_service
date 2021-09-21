package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person p  = new Person();
		assertThat(p).isNotNull();
		assertThat(p).isInstanceOf(Person.class);
	}
	

	@Test
	void testPersonStringStringDateStringStringLocation() {
		Person p  = new Person(null, "lili", "lili@gmail.com", "lili","lili", "mimi", new Date(), "male", "+221 14 14 74", new Location(), new ArrayList<>(), 0);
		assertThat(p).isNotNull();
		assertThat(p).isInstanceOf(Person.class);
	}

}
