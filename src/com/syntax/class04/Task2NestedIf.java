package com.syntax.class04;

public class Task2NestedIf {

	public static void main(String[] args) {
		// Create a Java program and store values of mortgage rate 
		//and mortgage price. First, program should check if rate is 
		//higher than 4.5 user will not buy a house, otherwise user 
		//will consider buying. Once user decides to buy a house, 
		//if price of the house is larger than 200000 than user 
		//will take a loan, otherwise user will pay cash.
		
		double mr = 4.0;
		double mp = 250000.0;
		
		if(mr<4.5) {
			System.out.println("User will by a appartment");
			if(mp>200000) {
				System.out.println("User is gnna take a loan");	
			}else {
				System.out.println("user will pay cash");
			}
		}else {
			System.out.println("Its too high mr");
		}
		
	}
}
