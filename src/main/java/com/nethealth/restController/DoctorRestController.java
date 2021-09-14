package com.nethealth.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nethealth.entities.Doctor;
import com.nethealth.service.DoctorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/doctors")
public class DoctorRestController {
	
	
	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("")
	public ResponseEntity<Doctor> save(@RequestBody Doctor doctor){
		if(doctorService.saveDoctor(doctor) == null){
			return new ResponseEntity<Doctor>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Doctor>(HttpStatus.CREATED);
	}

}
