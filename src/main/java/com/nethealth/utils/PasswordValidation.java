package com.nethealth.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
	
	/**
	 * 	(?=.*[0-9]) un chiffre doit apparaître au moins une fois
		(?=.*[a-z]) une lettre minuscule doit apparaître au moins une fois
		(?=.*[A-Z]) une lettre majuscule doit apparaître au moins une fois
		(?=\\S+$) aucun espace n'est autorisé dans toute la chaîne
		{8,} au moins 8 caractères
	 */
	
	//public static final Pattern VALID_PASSWORD_REGEX1 =  Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
	
	public static final Pattern VALID_PASSWORD_REGEX = 
		    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$");
	
	
	public static boolean validate(String password) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
        return matcher.find();
	}
	
	
	
	

}
