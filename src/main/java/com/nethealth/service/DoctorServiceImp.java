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
public class DoctorServiceImp implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	BCryptPasswordEncoder bcrypPasswordEncoder;

	@Override
	public Doctor saveDoctor(Doctor doctor) throws Exception {
		String username = doctor.getUsername();
		String email = doctor.getEmail();
		String password = doctor.getPassword();
		int status = 0;
		String phoneNumber = doctor.getPerson().getPhoneNumber();
		String country = doctor.getPerson().getLocation().getCountry();
		String district = doctor.getPerson().getLocation().getDistrict();
		if (username != null && email != null && password != null && phoneNumber != null && country != null
				&& district != null) {
			if (doctorRepository.findByUsername(username) != null) {
				throw new Exception("there is a user with " + username);
			}
			if (!EmailValidation.validate(email)) {
				throw new Exception("This email is not valid");
			}
			if (doctorRepository.findByEmail(email) != null) {
				throw new Exception("there is a user with this email " + email);
			}
			if (!PasswordValidation.validate(password)) {
				throw new Exception(
						"the password must be at least 8 characters long with an upper and lower case letter and at least one number");
			}
			if (!TelephoneNumberValidator.validator(phoneNumber)) {
				throw new Exception("the telephone number is not valid");
			}
			System.out.println(doctor);
			doctor.setPassword(bcrypPasswordEncoder.encode(password));
			doctor.setStatus(status);
			List<String> r = new ArrayList<>();
			r.add(Role.DOCTOR.name());
			doctor.setRoles(r);
			return doctorRepository.save(doctor);

		}

		throw new Exception("Unable to create a user missing data");
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
