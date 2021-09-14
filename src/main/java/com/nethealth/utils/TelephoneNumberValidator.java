package com.nethealth.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneNumberValidator {

	//^[0-9]*$
	
	public static final Pattern TELEPHON_REGEX = 
		    Pattern.compile("^[0-9]*$");
	
	
	private static boolean validate(String tel) {
        //Matcher matcher1 = VALID_PASSWORD_REGEX1.matcher(password);
        Matcher matcher = TELEPHON_REGEX.matcher(tel);
        return matcher.find();
	}
	
	
	public static boolean validator(String tel) {
		String result = tel.replaceAll("\\s+","");
		char c = result.charAt(0);
		int length = result.length();
		if(c == '+') {
			String resultSub = result.substring(1);
			if(validate(resultSub) && length >= 4 && length <= 15) {
				return true;
			}else {
				return false;
			}
		}else {
			if(validate(result) && length >= 4 && length <= 15) {
				return true;
			}else {
				return false;
			}
		}
		
	}
	

}
