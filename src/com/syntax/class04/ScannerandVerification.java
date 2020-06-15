package com.syntax.class04;

import java.util.Scanner;

public class ScannerandVerification {

	public static void main(String[] args) {
		// capture 2 numbers from user and
		//identify which is larger
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int a = input.nextInt();
		System.out.println("Please enter second number");
		int b = input.nextInt();
		input.close();
		System.out.print("You put " + a);
		System.out.println(" and " + b);
		
		if (a>b) {
			System.out.println(a + " is larger than " + b);	
		} else if(a==b) {
			System.out.println(a + " is equal " + b);
		}
		else {
			System.out.println(b + " is larger than " + a);
		}
	}
}
