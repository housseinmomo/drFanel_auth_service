package com.nethealth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nethealth.entities.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
	Doctor findByEmail(String email);
	Doctor findByUsername(String username);


}
 