package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TypeOfWorkLocationTest {

	@Test
	void test() {
		TypeOfWorkLocation typeOfWorkLocation = TypeOfWorkLocation.HOSPITAL;
		assertThat(typeOfWorkLocation.equals(TypeOfWorkLocation.HOSPITAL));
		
	}

}
