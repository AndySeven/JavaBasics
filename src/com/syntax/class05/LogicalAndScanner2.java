package com.syntax.class05;

import java.util.Scanner;

public class LogicalAndScanner2 {

	public static void main(String[] args) {
		/*
		 * Take input from the user and
		 * then based on the age print output
		 * if age from 0-3 --> baby
		 * 4-5 --> kid
		 * 6-12 --> child
		 * 13-19 --> teenager
		 * 20-64 --> adult
		 * more or equal to 65 --> senior
		 */

		int age;
		Scanner scan;
		String human;
		
		
		scan = new Scanner(System.in);
		System.out.println("enter your age");
		age = scan.nextInt();
		scan.close();
		
		if (age>=0 && age<=3) {
			human = "baby";
		}else if (age>=4 && age <= 5) {
			human = "kid";
		}else if (age>=6 && age <= 12) {
			human = "child";
		}else if (age>=13 && age <= 19) {
			human = "teenager";
		}else if (age>=20 && age <= 64) {
			human = "adult";
		}else {
			human = "senior";
	}
		System.out.println(human);
}
}
