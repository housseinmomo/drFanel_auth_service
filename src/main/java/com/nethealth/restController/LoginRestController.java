package com.nethealth.restController;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nethealth.dtos.LoginDto;
import com.nethealth.security.jwt.JwtParameters;
import com.nethealth.security.jwt.JwtUtils;
import com.nethealth.service.LoginService;
import com.nethealth.utils.LoginServiceUtils;
import com.nethealth.utils.ResponseMessage;
import com.nethealth.utils.ValidateData;
import com.nethealth.utils.exception.ConditionException;

@RestController
@RequestMapping("/api/users")
public class LoginRestController {
	
	@Autowired
	LoginService loginModelService;
	@Autowired
	BCryptPasswordEncoder bcrypPasswordEncoder;
	@Autowired
	LoginServiceUtils loginModelServiceUtils;
	
	@PostMapping("/login")
	public ResponseEntity<Object> siginIn(@RequestBody LoginDto loginModel, HttpServletResponse httpServeletResponse){
		ResponseMessage response = new ResponseMessage();
		JwtUtils jwtUtils = new JwtUtils();
		try {
			User userDetailService = (User) loginModelService.loadUserByUsername(loginModel.getUsername());
			ValidateData.validatorCondition("the password is incorrect", bcrypPasswordEncoder.matches(loginModel.getPassword(), userDetailService.getPassword()));
			ValidateData.validatorCondition("this account is not activate", loginModelServiceUtils.fetchStatus(loginModel.getUsername()));
			String jwt = jwtUtils.generateToken(userDetailService);
			httpServeletResponse.addHeader(JwtParameters.HEADER_STRING,JwtParameters.PREFIX+jwt);
			response.setStatus(HttpStatus.CREATED);
            response.addEntry("created token for : ", loginModel);
		}catch (ConditionException | UsernameNotFoundException exception) {
			response.setStatus(HttpStatus.BAD_REQUEST);
            response.addEntry("message", exception.getMessage());
		}catch (Exception exception) {
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            response.addEntry("message", exception.getMessage());
		}
		return ResponseEntity.status(response.getStatus()).body(response.getResponse());
	}
	
	

}
 