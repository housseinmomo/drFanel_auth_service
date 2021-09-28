package com.nethealth.utils;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.nethealth.entities.Person;

class ValidateDataTest {

	@Test
	void testValidatorBean() throws Exception {
		try {
			Person person = new Person();
	        ValidateData.validatorBean(person);
	    } catch(Exception e) {
	    	assertThat(e.getMessage()).isEqualTo("validation impossible");
	    }	
	}

	
}
