package com.syntax.class04;

import java.util.Scanner;

public class Task01Scanner {

	public static void main(String[] args) {
	
	/*
	 * You are a loan specialist and you need to 
	 * ask user what is the amount of loan is needed. 
	 * If loan is less than 200,000 then you would lend
	 * the money otherwise you would reject the client. 
	 */
		
		Scanner loan = new Scanner(System.in);
		System.out.println("How mach money do you need?");
		int loanAmount = loan.nextInt();
		loan.close();		
		if (loanAmount < 200000) {
			System.out.println("we'll give you a loan");
		} else {
			System.out.println("Sorry, this amount is too big");
		}
	}

}
