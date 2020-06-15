package com.syntax.class07;

import java.util.Scanner;

public class LuckyNamber {

	public static void main(String[] args) {
	
//		//we are playing a lottery and lucky number is 17
//		// number 1-20
//		// congrats to you
//		
//		boolean a = true;
		Scanner sc;
		int num;
		sc = new Scanner(System.in);
//		
//		while (a) {
//			System.out.print("Enter number 1-20: ");
//			num = sc.nextInt();
//			if (num != 17) {
//				System.out.println("Try Again");
//			}
//			else {
//				System.out.println("You are Lucky Winner");
//				a = false;
//			}
//		}
		
		do {
			System.out.print("Enter number 1-20: ");
			num = sc.nextInt();
			if(num>20 || num<1) {
				System.out.println("1-20!!!!");
			}else if (num != 17) {
				System.out.println("Try Again");
			}
			
			
		}while(num != 17);
		
		
		System.out.println("You are Lucky Winner");
		
		sc.close();
	}
}
