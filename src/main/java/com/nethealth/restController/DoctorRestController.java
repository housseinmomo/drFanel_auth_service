package com.nethealth.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nethealth.entities.ConfirmationToken;
import com.nethealth.entities.Doctor;
import com.nethealth.repository.ConfirmationTokenRepository;
import com.nethealth.service.DoctorService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/doctors")
public class DoctorRestController {
	
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private ConfirmationTokenRepository ctrepo;
	
	
	
	@PostMapping("")
	public ResponseEntity<Doctor> save(@RequestBody Doctor doctor) throws Exception{
		Doctor d = doctorService.saveDoctor(doctor);
		
		if(d == null){
			throw new Exception("Unable to create this user");
		}
		
		
		String email = d.getEmail();
		ConfirmationToken ct = new ConfirmationToken(email);
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(email);
        mailMessage.setSubject("Complete Registration!");
        mailMessage.setFrom("sandrine.louise.ekobe@gmail.com");
        mailMessage.setText("To confirm your account, please click here : "
        +"http://localhost:9999/api/doctors/activate/account?link="+ct.getConfirmationToken());
		
        ctrepo.save(ct);
        
        javaMailSender.send(mailMessage);
        
        return new ResponseEntity<Doctor>(HttpStatus.CREATED);
	}
	
	
	@GetMapping("/activate/account")
	public ResponseEntity<Doctor> activateAccount(@RequestParam(value="link") String token) throws Exception{
		ConfirmationToken ct = ctrepo.findByConfirmationToken(token);
		
		if(ct != null) {
			long time = ct.getTime();
			if(System.currentTimeMillis()- time > 60*60*1000) {
				ctrepo.delete(ct);
				throw new Exception("the link is not valid any more");
			}else {
				String email = ct.getEmail();
				Doctor d = doctorService.findDoctorByEmail(email);
				if(d != null) {
					ctrepo.delete(ct);
					d.setStatus(1);
					return new ResponseEntity<Doctor>(d, HttpStatus.OK);
				}
				ctrepo.delete(ct);
				throw new Exception("there is no such user in the database");
			}
		}
		ctrepo.delete(ct);
		throw new Exception("this link does not exist");
		
	}

}
