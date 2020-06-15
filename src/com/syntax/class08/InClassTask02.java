package com.syntax.class08;

import java.util.Scanner;

public class InClassTask02 {

	public static void main(String[] args) {
		// Create a program that will be asking user
		// to apply for a credit card 10 times. 
		// As soon you get an “yes” from a user 
		// program should stop asking.

		Scanner s;
		String str;
		s = new Scanner(System.in);
		for(int i = 1; i<=10; i++) {
		System.out.println("Would you like to apply for a CC?");
		str = s.nextLine();
		if(str.equalsIgnoreCase("Yes")) {
			System.out.println("Ok, fill out the form, please");
			break;
		}
		
		}
		s.close();
	}

}
