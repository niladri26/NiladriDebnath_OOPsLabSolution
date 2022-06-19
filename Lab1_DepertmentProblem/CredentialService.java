package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*<>?_+/";

		String values = capitalLetters + smallLetters + numbers
				+ specialCharacters;

		Random random = new Random();

		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;

	}

	public String generateEmailAddress(String firstName, String lastName,
			String depertment) {
		return firstName + lastName + "@" + depertment + ".xyz.com";
	}

	public void showCredentials(Employee employee, String email,
			char[] generatePassword) {
		System.out.println("Dear " + employee.getFirstName()
				+ " your generated credentials are as follows ");
		System.out.println("Email---> " + email);
		System.out.print("Password---> 1"); 

		System.out.print(generatePassword);
	}

}
