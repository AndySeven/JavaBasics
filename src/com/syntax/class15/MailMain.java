package com.syntax.class15;
// Create a method createEmail(). 
// Based on provided users name, 
// lastName and email type, your method
// should return complete email Address. 
// Example: johnsnow@gmail.com or johnsnow@yahoo.com*



public class MailMain {
	
	String getEmail(String surname) {
		String email;
		email = (surname+"@gmail.com").toLowerCase();
		return email;
	}

	public static void main(String[] args) {
		MailMain mm = new MailMain();
		System.out.println(mm.getEmail("Yakubko"));

	}

}
