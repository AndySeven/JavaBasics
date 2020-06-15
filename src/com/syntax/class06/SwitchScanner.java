package com.syntax.class06;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
//		   Ask user a gender:
//		   then based on gender will provide description

		Scanner scan;
		char gender;
		String genderType;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter gender: M or F ");
		gender = scan.next().charAt(0);
		scan.close();
		
		switch(gender) {
		case 'F':
			genderType = "Remale";
			break;
		case 'M':	
			genderType = "Male";
			break;
		default:
			genderType = "unknown";
		}
		
		System.out.println("Your gender is: " +genderType);
	}

}
