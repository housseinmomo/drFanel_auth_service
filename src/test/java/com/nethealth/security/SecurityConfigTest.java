package com.nethealth.security;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(SecurityConfig.class)
class SecurityConfigTest {
	

	@Autowired
    private MockMvc mvc;
	

	@Test
	void testConfigureHttpSecurity() throws Exception {
		
		mvc.perform(MockMvcRequestBuilders.get("/api/doctors")).andExpect(status().isForbidden());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
