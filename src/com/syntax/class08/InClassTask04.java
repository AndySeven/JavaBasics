package com.syntax.class08;

import java.util.Scanner;

public class InClassTask04 {

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
		int price, payment, amount = 0, change = 0, remainder;

		sc = new Scanner(System.in);

		System.out.println("Enter item you wanna buy");
		item = sc.nextLine();
		System.out.println("Enter the price of the item");
		price = sc.nextInt();

		for (int i = 1; i <= 500; i++) {
			System.out.println("Enter your payment");
			payment = sc.nextInt();
			amount = amount + payment;
			if (amount == price) {
				System.out.println("Thank you for shopping!");
				break;
			} else if (amount > price) {
				change = amount - price;
				System.out.println("Your change is " + change + "$");
				System.out.println("Thank you for shopping!");
				break;
			} else {
				remainder = price - amount;
				System.out.println("You should pay " + remainder + " $ more");
			}
		}
		sc.close();
		System.out.println("User has bought " + item + " for " + price + " $");
	}

}
