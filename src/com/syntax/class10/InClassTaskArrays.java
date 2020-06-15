package com.syntax.class10;

public class InClassTaskArrays {

	public static void main(String[] args) {
		// Create an array of animals and 
		// store 6 elements into it. 
		// Using 2 different loops print 
		// all elements from the array.
	String[] animals = {"tiger","badger","bear","goat","coala","racoon"};
	
	for(int a=0; a<animals.length; a++) {
		System.out.print(animals[a]+" ");
	}
	System.out.println();
	for(String animal:animals) {
		System.out.print(animal+" ");
	}
	System.out.println();
	System.out.println("--------------------Sum-------");
	int[] numbers = {23,45,56,34,67,78};
	int som = 0;
	for(int number:numbers) {
		som+=number;
		
	}System.out.println(som);
	int sum = 0;
	for(int i=0; i<numbers.length; i++) {
		sum+=numbers[i];
	}System.out.println(sum);
	
	System.out.println("-----------retreive and assign--------");
	
	String[] countries = {"USA","South Korea","Spain","Italy","Japan"};
	String[] capitols = {"Seul","Washington", "Madrid","Tokio","Rome"};
	for(String country:countries) {
		switch (country) {
		case ("USA"):
			System.out.println("The capitol of "+country+ " is " +capitols[1]);
			break;
		case ("South Korea"):
			System.out.println("The capitol of "+country+ " is " +capitols[0]);
			break;
		case ("Spain"):
			System.out.println("The capitol of "+country+ " is " +capitols[2]);
			break;
		case ("Italy"):
			System.out.println("The capitol of "+country+ " is " +capitols[4]);
			break;
		case ("Japan"):
			System.out.println("The capitol of "+country+ " is " +capitols[3]);
			break;
		}	
	}

	int i=0;
	
	for(String country:countries) {
		switch (country) {
		case ("USA"):
			i=1;
			break;
		case ("South Korea"):
			i=0;
			break;
		case ("Spain"):
			i=2;
			break;
		case ("Italy"):
			i=4;
			break;
		case ("Japan"):
			i=3;
			break;
		}
		System.out.println("The capitol of " +country+ " is " +capitols[i]);
	}
	
	System.out.println("======================school ");
	
	for(int b=0; b<countries.length; b++) {
		switch(countries[b]) {
		case "USA":
			System.out.println("The Capital is Washington");
			break;
		case "South Korea":
			System.out.println("The Capital is Seul");
			break;
		case "Spain":
			System.out.println("The Capital is Madrid");
			break;
		case "Italy":
			System.out.println("The Capital is Rome");
			break;
		case "Japan":
			System.out.println("The Capital is Tokio");
			break;
		}
		
	}
	
	}
}
	
	
	
	