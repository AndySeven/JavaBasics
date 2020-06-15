package com.syntax.class17;

public class InClassTaskVawel {

//	Create a method that will accept a String as a parameter 
//	and return a new String that consist only of vowels. 
//	Method should be available inside the class where 
//	it was declared and executed by calling it is name.
	
	private String getStringOnlyVawels(String str) {
		
		return str.replaceAll("[^AaEeIiOoUuYy]","");
	}
	

	public static void main(String[] args) {
	
		InClassTaskVawel obj = new InClassTaskVawel();
		System.out.println(obj.getStringOnlyVawels("Today is a great day"));
	}
}
