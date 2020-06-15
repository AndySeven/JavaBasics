package com.syntax.class12;

import java.util.Scanner;

public class InClassTask01Strings {

	public static void main(String[] args) {
		
System.out.println("--------------------------Task02-------------------");
System.out.println();
	// Create a String and print it in
	// reverse order (Sunday → yadnuS).
		String str = "Sunday";
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		
System.out.println("--------------------------Task02-------------------");
System.out.println();
		// Create a String and if the String is not 
	// empty perform the following: 
	// - if the String has an odd number of 
	// characters and has 3 or more characters, 
	// print the character in the middle of the String.
		
		
		String str1 = "2hdwyw5wrthad";
		char ch=0;
		if (str1.length()%2!=0 && str1.length()>=3) {
			ch = str1.charAt(((str1.length()-1)/2));
		}
		System.out.println("Character in the middle of the string is: " +ch);
		System.out.println("Middel index is: " +(str1.length()-1)/2);
		
System.out.println("--------------------------Task03-------------------");
System.out.println();
//Write a program that reads two people’s first 
//names and if they expecting boy or girl?
//
//Based on the input suggests a name for a baby:
//Example Output:
//
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL

Scanner sc = new Scanner(System.in);

String fnameMom, fnameDad, fnameBaby=null, baby;

	System.out.println("Mom’s first name?");
	fnameMom = sc.nextLine();
	System.out.println("Dad’s first name?");
	fnameDad = sc.nextLine();
	System.out.println("Boy or Girl?");
	baby = sc.nextLine();
	
	
	if(baby.equalsIgnoreCase("boy")) {
		fnameBaby = fnameDad.substring(0,3).toUpperCase() + fnameMom.substring(2).toUpperCase();
	}else if(baby.equalsIgnoreCase("girl")) {
		fnameBaby = fnameMom.substring(0,2).toUpperCase()+fnameDad.substring(3).toUpperCase();
	}else {
		System.out.println("invalid data");
	}
	System.out.println("Suggested baby name: " +fnameBaby);
	sc.close();
		
	}
}
