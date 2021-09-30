package com.nethealth.restController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nethealth.dtos.LoginDto;
import com.nethealth.service.LoginService;
import com.nethealth.utils.LoginServiceUtils;

@RunWith(SpringRunner.class)
@WebMvcTest(LoginRestController.class)
class LoginRestControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	@MockBean
	LoginService loginModelService;
	@MockBean
	BCryptPasswordEncoder bcrypPasswordEncoder;
	@MockBean
	LoginServiceUtils userDetailServiceUtils;
	@Autowired
	private ObjectMapper objectMapper;
	
	static LoginDto loginModel;
	static User user;
	@BeforeAll
    public static void setUp(){
		List<GrantedAuthority> grantedAuthority = new ArrayList<>();
		loginModel = new LoginDto("louise", "mamaLii123");
		user = new User("louise","mamaLii123", grantedAuthority); 
    }

	

	@Test
	void testSiginIn() throws Exception {
		Mockito.when(loginModelService.loadUserByUsername(user.getUsername())).thenReturn(user);
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.post("/api/users/login")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(loginModel));
		System.out.println(Mockito.when(loginModelService.loadUserByUsername(loginModel.getUsername())).thenReturn(user).toString());
		System.out.println(objectMapper.writeValueAsString(loginModel));
		mockMvc.perform(mockHttpServletRequestBuilder).andExpect(status().is4xxClientError());
	}

}
