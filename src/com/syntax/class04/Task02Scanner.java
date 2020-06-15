package com.syntax.class04;

import java.util.Scanner;

public class Task02Scanner {

	public static void main(String[] args) {
		
		/* You are DMV representative and you need to ask
		   customer their age. If they are 18 and older 
		   you will issue a driver licence to them, otherwise
		   you will offer them to get a learners permit. 
		*/

		Scanner input = new Scanner(System.in);
		System.out.println("Good Evening! What is your age?");
		int age = input.nextInt();
		input.close();
		if(age>=18) {
			System.out.println("That's ok! We'll issue a DL for you");
		}else {
			System.out.println("You can get just the learner permit");
		}
		
	}

}
