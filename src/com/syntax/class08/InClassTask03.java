package com.syntax.class08;

import java.util.Scanner;

public class InClassTask03 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers 
		// (start and end point), provided by a user and then
		// from that range prints the sum of the even and odd integers.
		
		Scanner sc;
		int start, end, sumE=0, sumO=0, change;
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter start point");
		start = sc.nextInt();
		System.out.println("Enter end point");
		end = sc.nextInt();
		if (start>end) {
			change = start;
			start = end;
			end = change;
		}
		for (int i=start; i<=end; i++) {
			if (i%2==0) {
				sumE = sumE+i;
			}else {
				sumO = sumO+i;
			}
		}
		
		System.out.println("Even sum = " +sumE+ "; Odd sum = " +sumO);
		sc.close();

	}

}
