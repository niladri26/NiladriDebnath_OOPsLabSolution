package com.greatlearning.model;

public class Employee {

	String firstName;
	String lastName;

	public String getFirstName() {// ------------getter setter
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(String firstName, String lastName) {// --------constructor
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
