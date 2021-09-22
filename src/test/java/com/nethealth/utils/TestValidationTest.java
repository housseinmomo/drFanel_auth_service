package com.nethealth.utils;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.nethealth.entities.Person;

class TestValidationTest {

	@Test
	void testValidatorBean() throws Exception {
		try {
			Person person = new Person();
	        TestValidation.validatorBean(person);
	    } catch(Exception e) {
	    	assertThat(e.getMessage()).isEqualTo("validation impossible");
	    }	
	}

	
}
