package com.expensewebsite.model;

import java.time.LocalDate;

public class Employees {
	
	private long employeeId;
	private String email;
	private String password;
	private String position;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	
	
	public Employees() {
		super();
	
	}


	public Employees(long employeeId, String email, String password, String position, String firstName, String lastName,
			LocalDate dob) {
		super();
		this.employeeId = employeeId;
		this.email = email;
		this.password = password;
		this.position = position;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getFirstName() {
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


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", email=" + email + ", password=" + password + ", position="
				+ position + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}
	
	

}
