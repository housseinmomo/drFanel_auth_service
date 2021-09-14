package com.nethealth.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EmailValidationTest {

	@Test
	void testValidate() {
		String email1 = "elslouise@gmail.com";
		String email2 = "elsoui";
		String email3 = "els@gmail";
		assertThat(EmailValidation.validate(email1)).isTrue();
		assertThat(EmailValidation.validate(email2)).isFalse();
		assertThat(EmailValidation.validate(email3)).isFalse();
	}

}
