package com.syntax.class05;

import java.util.Scanner;

public class LogicalNotScanner {

	public static void main(String[] args) {
		/*   You are a salesman
		 * 	 ask user for how much his 
		 *   sales are based on the amount of sales
		 *   we need to calculate commision
		 *   if commission is between 1-100 10%
		 *   100-200 20%
		 *   200-500 30%
		 * 	 more 500 -50%
		 * 
		 * if your sales are 200 --> 40
		 */

		Scanner sc = new Scanner (System.in);
		
		double sales;
		double commission;
		
		System.out.println("Enter your sales amout");
		sales = sc.nextDouble();
		sc.close();
		
		if (sales>=1 && sales <=100) {
			// give 10% commission
			commission = sales * 0.10;
		}else if(sales>100 && sales<=200) {
			commission = sales * 0.20;
		}else if(sales>200 && sales<500) {
			commission = sales * 0.30;
		}else {
			commission = sales * 0.5;
		}
		
		System.out.println("Based on sales your commision is = " + commission);
	
		if (commission>100) {
			System.out.println("You are awesome seller");
		}
}			
}

