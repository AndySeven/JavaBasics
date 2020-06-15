package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/*
		 *  write a prog to ask user if there is sale
		 *  if no sale --> not going shopping
		 *  if sale we will ask the price of them
		 *  based on the price we will apply discount and calculate final price
		 * 
		 * 	if price less than 20 --> apply 10%
		 *  20-100 --> apply 20%
		 *  100-500 --> apply 30%
		 *  more than 500 --> apply 50%
		 * 
		 *  After discount __ the price of the item reduced from __ to __  
		 */
		
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan = new Scanner(System.in);
		
		System.out.println("Is there sale or not?");
		sale = scan.nextLine();
		scan.close();
		
		if (sale.equalsIgnoreCase("yes")){
			System.out.println("What is the price?");
			price = scan.nextDouble();
			if (price<20) {
				discount = 0.10;
			}else if (price>=20 && price<100) {
				discount = 0.20;
			}else if (price>=100 && price<500) {
				discount = 0.30;
			}else {
				discount = 0.50;
			}
			
			finalPrice = price - price*discount;
			
			System.out.println("After discount " + discount + 
								" % the price of the item reduced from " + 
								price + " $ to " + finalPrice + " $");
		}else {
			System.out.println("We are not gonna shopping");
		}	
	}
}
