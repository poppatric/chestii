package com.che.yacs.model;

import org.springframework.data.annotation.Id;


public class Customer {
	
	@Id
	private int		id;
	
	private String	firstName;
	private String	lastName;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
