package com.syntax.class04;

import java.util.Scanner;

public class Task05Scanner {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		System.out.println("Input your workong years");
		int years = input.nextInt();
		System.out.println("Input your annual salary");
		int salary = input.nextInt();
		input.close();
		if (years >= 5) {
			System.out.println("You are eligible for bonus");
			if (salary > 50000) {
				System.out.println("The bonus is 5000");
			}else {
				System.out.println("The bonus is 3000");
			}
			
		}else {
			System.out.println("You are not elegible for bonus");
		}
	}

}
