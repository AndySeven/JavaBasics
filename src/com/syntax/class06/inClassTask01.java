package com.syntax.class06;
import java.util.Scanner;
public class inClassTask01 {

		public static void main(String[] args) {
		/*	
		 * 	 Ask user to enter their country and capture it.
		 *   Once values are captured print which language
		 *   user speaks.
		 */
		
		String country;
		String language = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your country: ");
		country = scan.nextLine();
		scan.close();
		
		switch(country) {
		case "USA":
			language = "english";
			break;
		case "Ukrain":
			language = "ukranian";
			break;
		case "Belarus":
			language = "belarusian";
			break;
		case "Italy":
			language = "italian";
			break;
		default:
			language = "unknown";
			break;
		}
			System.out.println(language);
	}
}
