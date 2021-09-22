package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ConfirmationTokenTest {

	@Test
	void testConfirmationToken() {
		ConfirmationToken confirmationToken = new ConfirmationToken("lili@gmail.com");
		assertThat(confirmationToken).isNotNull();
		assertThat(confirmationToken).isInstanceOf(ConfirmationToken.class);
	}

}
