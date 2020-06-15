package com.syntax.class05;

import java.util.Scanner;

public class InHomeTask02 {

	public static void main(String[] args) {
//		Write a program to find largest 
//		of three double values using if-else..if 
//		and logical operators provided by a user 
//		(numbers must be distinct)
		
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number a");
		a = sc.nextDouble();
		System.out.println("Please enter number b");
		b = sc.nextDouble();
		System.out.println("Please enter number c");
		c = sc.nextDouble();
		
		
		if (a > b && a > c) {
			System.out.println("a is largest");
		}else if (b > a && b > c) {
			System.out.println("b is largest");
		}else if (c > a && c > b) {
			System.out.println("c is largest");
		}else {
			System.out.println("numbers are equal");
		}
		
		
		
		System.out.println("------------Task4-------------");
//		Program to find largest number among three numbers 
//		using nested if provided by a user (numbers must be distinct)
		
		double d, e, f;
		
		System.out.println("Please enter number d");
		d = sc.nextDouble();
		System.out.println("Please enter number e");
		e = sc.nextDouble();
		System.out.println("Please enter number f");
		f = sc.nextDouble();
		sc.close();
		
		if (d > e) {
			if (d > f) {
				System.out.println("d is largest");
			}else {
				System.out.println("f is largest");
			}
		} else {
			if (e > f) {
				System.out.println("e is largest");
			}else {
				System.out.println("f is largest");
			}
			
		}
	}
}
