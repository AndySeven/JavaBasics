package com.syntax.class08;

import java.util.Scanner;

public class InClassTask04$3 {

	public static void main(String[] args) {
		// Write a program to ask a user to enter item they want
		// to buy and the price of that item. Every time user enters 
		// money accumulate the amount and tell the user how much 
		// is left to pay off the amount. 
		// If user give more money program should return a change. 
		// Whenever a user done with payments program should 
		// say “Thank you for shopping!”

		Scanner sc;
		String item;
		double price;
		double amount=0;
		double payment;
		double remainder;
		double change;
		
		sc = new Scanner(System.in);
		
		System.out.println("Please enter item you wanna buy");
		item = sc.nextLine();
		System.out.println("Please enter the price of the item");
		price = sc.nextDouble();
		
		while (amount!=price) {
			System.out.println("Please make payment");
			payment = sc.nextDouble();
			amount = amount+payment;
			if (amount<price) {
				remainder = price - amount;
				System.out.println("Please pay " +remainder+ "$ more");
			}else if (amount>price) {
				change = amount-price;
				System.out.println("Thanks, your change is " +change+"$");
				break;
				}
		}
		System.out.println("Thanks for shopping "+item);
		sc.close();
	}
}
