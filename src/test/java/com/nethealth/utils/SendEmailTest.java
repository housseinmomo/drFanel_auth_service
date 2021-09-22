package com.nethealth.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.mail.SimpleMailMessage;

class SendEmailTest {

	@Test
	void testAutomaticEmail() {
		SimpleMailMessage simpleMailMessage =  SendEmail.automaticEmail("elslouisette@gmail.com", "token de validation");
		assertThat(simpleMailMessage).isNotNull();
		assertThat(simpleMailMessage).isInstanceOf(SimpleMailMessage.class);
	}

}
