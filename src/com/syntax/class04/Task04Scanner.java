package com.syntax.class04;

import java.util.Scanner;

public class Task04Scanner {

	public static void main(String[] args) {
		//Credit Card
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a credit Card");
		String answer = input.nextLine();
		
		input.close();
		if (answer.equals("yes")) {
			System.out.println("What is the balance on the card?");
			int balance = input.nextInt();
			if (balance >= 1000) {
				System.out.println("Please, pay you credt card balance");
			} else {
				System.out.println("You can spend more");
			}
		} else if (answer.equals("no")) {
			System.out.println("Would you like to get our Credit Card");
		}
	}
}
