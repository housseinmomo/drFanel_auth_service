package com.nethealth.restController;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nethealth.entities.Doctor;
import com.nethealth.entities.Education;
import com.nethealth.entities.Location;
import com.nethealth.entities.Person;
import com.nethealth.entities.WorkLocation;
import com.nethealth.service.DoctorService;

@RunWith(SpringRunner.class)
@WebMvcTest(DoctorRestController.class)
class DoctorRestControllerTest {
	
	@Autowired
	private MockMvc mockMvc ;
	
	 @MockBean
	 private DoctorService doctorService;
	 
	 @Autowired
	private ObjectMapper objectMapper; //convertir en json

	@Test
	void testSave() throws Exception {
		List<String > roles = new ArrayList<>();
		Doctor d = new Doctor(null, "bbili", "bbili@gmail.com", "TTili123",
				new Person("mimi", "mimi", new Date(), "female", "+221 47 78 95",
						new Location("Senegal", "dakar", "point e", "98000")), 0,
				new WorkLocation(), new Education(), roles);
		String uri = "/api/doctors";
		
        String json = objectMapper.writeValueAsString(d);
		Mockito.when(doctorService.saveDoctor(d)).thenReturn(d);
		
		MvcResult mvcResult = mockMvc.perform(post(uri)
			    .contentType(MediaType.APPLICATION_JSON)
			    .content(json)
			    .characterEncoding("utf-8"))
			    .andExpect(status().isCreated())
			    .andReturn();
		
		String jsonResponse = mvcResult.getRequest().getContentAsString();
		System.out.println(jsonResponse);
		assertThat(jsonResponse).isEqualTo(json);	
	}

}
