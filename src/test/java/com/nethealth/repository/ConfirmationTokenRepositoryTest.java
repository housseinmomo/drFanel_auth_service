package com.nethealth.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nethealth.entities.ConfirmationToken;

@RunWith(SpringRunner.class)
@DataMongoTest
class ConfirmationTokenRepositoryTest {

	@Autowired
	private ConfirmationTokenRepository repo;

	@Test
	void testFindByConfirmationToken() {
		ConfirmationToken confirmationToken = new ConfirmationToken("lili@gmail.com");
		String token = confirmationToken.getConfirmationToken();
		repo.save(confirmationToken);
		Assert.assertNotNull(repo.findByConfirmationToken(token));

	}

}
