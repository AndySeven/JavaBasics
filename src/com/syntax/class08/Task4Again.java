package com.syntax.class08;

import java.util.Scanner;

/**
 * // Write a program to ask a user to enter item they want // to buy and the
 * price of that item. Every time user enters // money accumulate the amount and
 * tell the user how much // is left to pay off the amount. // If user give more
 * money program should return a change. // Whenever a user done with payments
 * program should // say “Thank you for shopping!”
 *
 */
public class Task4Again {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter you wanna buy");
		String item = sc.nextLine();
		System.out.println("Eneter the price");
		int price = sc.nextInt();
		int sum = 0;
		int change;
		do {
			System.out.println("Enter your payment");
			int payment = sc.nextInt();
			if (payment < (price - sum)) {
				System.out.println("Pay More");
				sum += payment;
			} else {
				System.out.println("Thanks for shopping"+item);
				sum += payment;
				break;
			}
		} while (sum < price);
		if (sum > price) {
			change = sum - price;
			System.out.println("Its your change Vasya: " + change);
		}
		sc.close();
	}
}
