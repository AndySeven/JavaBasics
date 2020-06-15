package com.syntax.class34;

public class TaskThrowExc {
	
	public static String checkAge(int age) {
		String message;
		if(age<16) {
			throw new RuntimeException("Age must be more or equal 16");
		}else {
			message = "Welcome To The Party";
		}
		return message;
	}

	public static void main(String[] args) {
		
		System.out.println(checkAge(20));
	}

}
