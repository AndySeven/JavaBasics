package com.syntax.class04;

import java.util.Scanner;

public class Task03Scanner {

	public static void main(String[] args) {
/*
		Create a Java program that will ask user to input 
		city and temperature. Your program should convert 
		Fahrenheit into celsius and print
		“The temperature is the city __ is __”
*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your city");
		String city = input.nextLine();
		System.out.println("Please input temperature");
		double t = input.nextDouble();
		double tc = (t - 32) * 5/9;
		input.close();
		
		
		System.out.println("The temperature is the city " +
					 city + " is " + tc + " celsius");
		
	}

}
