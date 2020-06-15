package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);

		while (a<5) {
		System.out.println("Whats your name?");
		String name = sc.nextLine();
			System.out.println("Good Afternoon " +name);
			a++;
			System.out.println();
	}
		sc.close();
}
}
