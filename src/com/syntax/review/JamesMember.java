package com.syntax.review;

public class JamesMember {
	String firstName; // belongs to the instance
	static String lastName; // static belong to the class
	int age; // belongs to the object

	void fullName() {
		System.out.println("Full name is " + firstName + " " + lastName);
	}

}
 class SmithMember {
	 	
	 	static int count=0;
		String firstName; // belongs to the instance
		static String lastName; // static belong to the class
		int age; // belongs to the object

		void fullName() {
			System.out.println("Full name is " + firstName + " " + lastName);
		}
	 
 }

