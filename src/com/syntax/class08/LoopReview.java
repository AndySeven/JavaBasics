package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc;
		double price,price2;
		
		sc = new Scanner(System.in);
		
		do {
		System.out.println("Please pay for a candy");
		price = sc.nextDouble();
		if (price >2 ) {
			System.out.println("To omuch money");	
		}else if (price < 2) {
			System.out.println("Too little money");
		}
		}while (price != 2);
		
		System.out.println("enjoy candy");
		
		System.out.println("Please pay for a candy");
		price2 = sc.nextDouble();
		
		while (price2!=2) {
			System.out.println("Please pay for a candy");
			price2 = sc.nextDouble();
			if (price2 >2 ) {
				System.out.println("To omuch money");	
			}else if (price2 < 2) {
				System.out.println("Too little money");
		}
		
		
	}System.out.println("enjoy candy");
sc.close();
}
}
