package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ConfirmationTokenTest {

	@Test
	void testConfirmationToken() {
		ConfirmationToken ct = new ConfirmationToken("lili@gmail.com");
		assertThat(ct).isNotNull();
		assertThat(ct).isInstanceOf(ConfirmationToken.class);
	}

}
