package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person person = new Person();
		assertThat(person).isNotNull();
		assertThat(person).isInstanceOf(Person.class);
	}

	@Test
	void testPersonStringStringLocalDateStringStringStringString() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person).isNotNull();
		assertThat(person).isInstanceOf(Person.class);
	}

	@Test
	void testGetFirstname() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getFirstname()).isEqualTo("lili");
	}

	@Test
	void testGetLastname() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getLastname()).isEqualTo("mimi");
		
	}

	@Test
	void testGetGender() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getGender()).isEqualTo("male");
		
	}

	@Test
	void testGetEmail() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getEmail()).isEqualTo("elslouisette@gmail.com");
		
	}

	@Test
	void testGetPassword() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getPassword()).isEqualTo("mimi");
		
	
	}

	@Test
	void testGetPhoneNumber() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getPhoneNumber()).isEqualTo("+221 77 289 27 32");
	}

	@Test
	void testSetFirstname() {
		Person person = new Person();
		person.setFirstname("lolo");		
		assertThat(person.getFirstname()).isEqualTo("lolo");
	}

	@Test
	void testSetLastname() {
		Person person = new Person();
		person.setLastname("kiki");		
		assertThat(person.getLastname()).isEqualTo("kiki");
	}

	@Test
	void testSetGender() {
		Person person = new Person();
		person.setGender("female");		
		assertThat(person.getGender()).isEqualTo("female");
	}

	@Test
	void testSetEmail() {
		Person person = new Person();
		person.setEmail("els@gmail.com");		
		assertThat(person.getEmail()).isEqualTo("els@gmail.com");
	}

	@Test
	void testSetPassword() {
		Person person = new Person();
		person.setPassword("lolo");		
		assertThat(person.getPassword()).isEqualTo("lolo");
	}

	@Test
	void testSetPhoneNumber() {
		Person person = new Person();
		person.setPhoneNumber("7801452");		
		assertThat(person.getPhoneNumber()).isEqualTo("7801452");

	}


	@Test
	void testGetDateOfBith() {
		Person person = new Person("lili", "mimi", LocalDate.parse("2020-04-30"), "male", "elslouisette@gmail.com", "mimi",
				"+221 77 289 27 32");
		assertThat(person.getDateOfBith()).isEqualTo("2020-04-30");
		
	}

	@Test
	void testSetDateOfBith() {
		Person person = new Person();
		person.setDateOfBith(LocalDate.parse("2020-04-30"));
		assertThat(person.getDateOfBith()).isEqualTo("2020-04-30");
	}

}
