package com.nethealth.entities;

import java.util.UUID;

import javax.security.auth.login.CredentialExpiredException;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Document(collection = "links")
public class ConfirmationToken {
	
	@Id
    private String id;

    private String confirmationToken;

    long time;

    private String email;
    
    public ConfirmationToken(String email) {
        this.email = email;
        time = System.currentTimeMillis();
        confirmationToken = UUID.randomUUID().toString();
    }
    
    public void validatorTime(String message) throws CredentialExpiredException {
    	if(System.currentTimeMillis() - this.time > 60*60*1000) {
    		throw new CredentialExpiredException(message);
    	}
    	
    }


}
