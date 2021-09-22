package com.nethealth.utils;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Async;

public class SendEmail {
	
	
	@Async
	public static SimpleMailMessage automaticEmail(String email, String confirmationToken) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(email);
		simpleMailMessage.setSubject("Complete Registration!");
		simpleMailMessage.setFrom("sandrine.louise.ekobe@gmail.com");
		simpleMailMessage.setText("To confirm your account, please click here : "
        +"http://localhost:9999/api/doctors/account/confirm?link="+confirmationToken);
        
        return simpleMailMessage;
		
	}

}
