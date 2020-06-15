package com.syntax.class04;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		/*
		 * CApture name from user and
		 * print the format
		 * My name is _____
		 */
		
		//Bring Scanner class into the program
		//System.in --> identifies keyboard
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		//capture line of text from user
		String name = scan.nextLine();
		System.out.println("My name is " + name);
		
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("Your name is " + name
				+ " your age is " + age);
		scan.close();
	}
}
