package com.syntax.class15;

public class MethodsTaskMain {
	public static void main(String[] args) {
		// - Create a method that will take 2 parameters 
		//as a numbers and prints which number is larger.
		// - Create a method that will take a number and 
		//prints whether the number is even or odd.
		// - Create a method that will print whether given
		//String is palindrome or not.
		// - Create a method that will say Hello in different
		//language based on the country that will passed
		//when method is executed. 
		
		MethodsTask m = new MethodsTask();
		
		m.largerNum(7, 9);
		m.evenOrOdd(9);
		m.palindromeString("bararab");
		m.HelloInDifLang("South Korea");
		}
	}
