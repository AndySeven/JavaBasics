package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type any text");
		String text = scan.nextLine();
		System.out.println(text);
		
		System.out.println("Enter any numbers");
		int number=scan.nextInt();
		System.out.println(number);
		System.out.println("End of the program");
		scan.close();
	}
}
