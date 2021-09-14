package com.nethealth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nethealth.entities.Doctor;
import com.nethealth.entities.Role;
import com.nethealth.repository.DoctorRepository;
import com.nethealth.utils.EmailValidation;
import com.nethealth.utils.PasswordValidation;
import com.nethealth.utils.TelephoneNumberValidator;

@Service
public class DoctorServiceImp implements DoctorService{

	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	BCryptPasswordEncoder bcrypPasswordEncoder;
	
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		String username = doctor.getUsername();
		String email = doctor.getEmail();
		String password = doctor.getPassword();
		int status = 0;
		String phoneNumber = doctor.getPerson().getPhoneNumber();
		String country = doctor.getPerson().getLocation().getCountry();
		String district = doctor.getPerson().getLocation().getDistrict();
		if(username != null && email != null && password != null && phoneNumber != null && country != null && district != null) {
			if(doctorRepository.findByUsername(username)!= null) {
				return null;
			}
			if(doctorRepository.findByEmail(email) != null) {
				return null;
			}
			if(!EmailValidation.validate(email)) {
				return null;
			}
			if(!PasswordValidation.validate(password)) {
				return null;
			}
			if(!TelephoneNumberValidator.validator(phoneNumber)) {
				return null;
			}
			System.out.println(doctor);
			doctor.setPassword(bcrypPasswordEncoder.encode(password));
			doctor.setStatus(status);
			List<String> r = new ArrayList<>();
			r.add(Role.ROLE_DOCTOR.name());
			doctor.setRoles(r);
			return doctorRepository.save(doctor);
		
		}
		
		return null;
	}
	
	@Override
	public Doctor findDoctorByUsername(String username) {
		return doctorRepository.findByUsername(username);
	}
	
	@Override
	public Doctor findDoctorByEmail(String email) {
		return doctorRepository.findByEmail(email);
	}
	
	
	
	
}
