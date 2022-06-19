package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee obj = new Employee("Abhik", "Dey");
		CredentialService cs = new CredentialService();

		System.out.println("Please enter depertment from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int option = sc.nextInt();

		switch (option) {

		case 1:
			String emailAdd = cs.generateEmailAddress(obj.getFirstName().toLowerCase(),
					obj.getLastName().toLowerCase(), "Technical");
			char[] password = cs.generatePassword();
			cs.showCredentials(obj, emailAdd, password);
			break;
		case 2:
			String emailAdd1 = cs.generateEmailAddress(obj.getFirstName().toLowerCase(),
					obj.getLastName().toLowerCase(), "Admin");
			char[] password1 = cs.generatePassword();
			cs.showCredentials(obj, emailAdd1, password1);
			break;
		case 3:
			String emailAdd2 = cs.generateEmailAddress(obj.getFirstName().toLowerCase(),
					obj.getLastName().toLowerCase(), "Human Resource");
			char[] password2 = cs.generatePassword();
			cs.showCredentials(obj, emailAdd2, password2);
			break;
		case 4:
			String emailAdd3 = cs.generateEmailAddress(obj.getFirstName().toLowerCase(),
					obj.getLastName().toLowerCase(), "Legal");
			char[] password3 = cs.generatePassword();
			cs.showCredentials(obj, emailAdd3, password3);
			break;

		}

	}

}
