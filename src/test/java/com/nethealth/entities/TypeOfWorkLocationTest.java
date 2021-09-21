package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TypeOfWorkLocationTest {

	@Test
	void test() {
		TypeOfWorkLocation type = TypeOfWorkLocation.HOSPITAL;
		assertThat(type.equals(TypeOfWorkLocation.HOSPITAL));
		
	}

}
