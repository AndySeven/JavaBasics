package com.syntax.class05;

import java.util.Scanner;

public class RecapClass04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any text");
		String text = sc.nextLine();
		String text1 = sc.nextLine();
		System.out.println(text1);
		System.out.println(text);
		
		System.out.println("Enter integer");
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}

}
