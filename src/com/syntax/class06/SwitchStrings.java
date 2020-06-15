package com.syntax.class06;
import java.util.Scanner;
public class SwitchStrings {
	public static void main(String[] args) {
		
		String country;
		String favoriteFood;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please ebter your country");
		country=scan.nextLine();
		scan.close();
		
		switch(country.toLowerCase()) {
			case "morocco":
				favoriteFood = "couscous";
				break;
			case "belarus":
				favoriteFood = "potato";
				break;
			case "tajikistan":
				favoriteFood = "Osh";
				break;
			case "turkey":
				favoriteFood = "Baklava";
				break;
			case "kazakhstan":
				favoriteFood = "Beshparmak";
				break;
			default:
				favoriteFood = "Unknown";
				break;
		}
		System.out.println("Your favorite food is: " + favoriteFood);
	
	}
}
