package com.nethealth.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PasswordValidationTest {

	@Test
	void testValidate() {
		String password1 = "louise";
		String password2 = "Louise";
		String password3 = "1233";
		String password4 = "Louise123";
		
		assertThat(PasswordValidation.validate(password1)).isFalse();
		assertThat(PasswordValidation.validate(password2)).isFalse();
		assertThat(PasswordValidation.validate(password3)).isFalse();
		assertThat(PasswordValidation.validate(password4)).isTrue();
	}

}
