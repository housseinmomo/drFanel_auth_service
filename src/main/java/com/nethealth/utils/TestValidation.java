package com.nethealth.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class TestValidation {

	public static void validatorBean(Object object) throws Exception{
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
		if (constraintViolations.size() > 0 ) {
			throw new Exception("validation impossible");
		}
	
	}

}
