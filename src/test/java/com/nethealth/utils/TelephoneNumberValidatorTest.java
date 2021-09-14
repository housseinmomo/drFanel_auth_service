package com.nethealth.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TelephoneNumberValidatorTest {

	@Test
	void testValidator() {
		String tel1 = "+211 47";
		String tel2 = "14";
		String tel3 = "0000007744";
		String tel4 = "sed122";
		
		assertThat(TelephoneNumberValidator.validator(tel1)).isTrue();
		assertThat(TelephoneNumberValidator.validator(tel2)).isFalse();
		assertThat(TelephoneNumberValidator.validator(tel3)).isTrue();
		assertThat(TelephoneNumberValidator.validator(tel4)).isFalse();
	}

}
