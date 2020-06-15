package com.syntax.teamwork;

import java.util.Scanner;

public class Task02PrimeNumbers {

	public static void main(String[] args) {
		// Write a java program to check whether 
		// a given number is prime or not?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enetr any integer");
		int num = sc.nextInt();
		int primeFlag=0;
		if(num>1) {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					primeFlag++;
				}
			}
		}
			if(primeFlag>0) {
				System.out.println("Your entered integer is not prime");
			}else {
				System.out.println("Your entered integer is prime");
			}
		sc.close();

	}
}
