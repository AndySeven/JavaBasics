package com.syntax.class05;

import java.util.Scanner;

public class InClassTask01 {

	public static void main(String[] args) {
//		Prompt the user to enter person heights in 
//		inches. Person should be classified as 
//		one of the following:
//		short (under 60 inch)
//		medium(between 60 -72 inch)
//		tall (over 72 inch)

		int height;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		height = sc.nextInt();
	
		if (height>0) {
			
			if (height>=0 && height<=60) {
				System.out.println("short");
			}else if (height>=60 && height<=72) {
				System.out.println("medium");
			}else  {
				System.out.println("tall");
		}
		}else {
			System.out.println("Invalid number");
		}
		System.out.println("---------Task02----------");
		
//		Write a program that will print whether it is 
//		a weekend or weekday. 
//		If any day from 1-5 → output “It is a weekday”, 
//		any day from 6-7 → output “It is a weekend”, 
//		any other day → output “Invalid day”
		
		int day;
		Scanner dc = new Scanner(System.in);
		
		System.out.println("Enter day of the week 0-7");
		
		day = dc.nextInt();

		if (day > 0) {
			
			if (day>=1 && day <= 5) {
			System.out.println("weekday");
			}else if (day>=6 && day<=7) {
			System.out.println("weekend");
			}else {
			System.out.println("invalid number of day");
		}
		}else {
			System.out.println("Invalid number");
		}
		
		System.out.println("---------ORs----------");
		
		
		int day1;
		Scanner fc = new Scanner(System.in);
		
		System.out.println("Enter day of the week 0-7");
		
		day1 = fc.nextInt();
	
		
		sc.close();
		dc.close();
		fc.close();
		if (day1==1 || day1==2 || day1==3 || day1==4 || day1==5) {
			System.out.println("weekdays");
		}else if (day1==6 || day1==7) {
			System.out.println("weekend");
		}else {
			System.out.println("Invalid day number");
		}
		
	}

}
