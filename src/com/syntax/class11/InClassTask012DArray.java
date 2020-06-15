package com.syntax.class11;

public class InClassTask012DArray {

	public static void main(String[] args) {
		// Create an array of cars : 
		// american, german, korean, italian. 
		// Then retrieve all values from that array using 2 different loops
		
		String[][] cars = {
				{"BMV","Mercedes","Audi"},
				{"Chevrolet","Ford","Buick","Ram"},
				{"Kia","Hyundai"},
				{"Ferrari","Fiat","Lambargini"},
		};
				
		for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		for(String[] c: cars) {
			for(String car: c) {
				System.out.print(car+" ");
			}
			System.out.println();
		}
		
		System.out.println("=============================================");
		
		//Create an array of countries: north america countries, 
		//south america countries, europe countries, asian countries, 
		//african countries. Then print all values from that array using
		//2 different loops and calculate how many total countries been stored.
		
		String[][] countries = {
				{"USA","Canada"},
				{"Brazilia","Argentina","Peru"},
				{"Italy","Spain","France","Germany","Switzerland"},
				{"South Korea","China","India"},
				{"Egypt","Marocco","RSA"},
		};
		int elements=0;
		for(int i=0; i<countries.length; i++) {
			for(int j=0; j<countries[i].length; j++) {
				
				System.out.print(countries[i][j]+" ");
				elements++;
			}
		System.out.println();
		}
		System.out.println(elements);
		
		int count=0;
		for(String[] c: countries) {
			for(String country: c) {
				
				System.out.print(country+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("Total countries is "+count);
	
	
	
	
	}
	

}
