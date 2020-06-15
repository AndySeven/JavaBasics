package com.syntax.class15;

public class MethodsTask {
			// - Create a method that will take 2 parameters 
			//as a numbers and prints which number is larger.
			// - Create a method that will take a number and 
			//prints whether the number is even or odd.
			// - Create a method that will print whether given
			//String is palindrome or not.
			// - Create a method that will say Hello in different
			//language based on the country that will passed
			//when method is executed. 
	
	void largerNum (int a, int b) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	
	void evenOrOdd(int c) {
		if(c%2==0) {
			System.out.println("c = "+c+" is even");
		}else {
			System.out.println("c = "+c+" is odd");
		}
	}
	
	void palindromeString(String str) {
		String str3 = "";
		for(int i=str.length()-1; i>=0; i--) {
			str3 = str3 + str.charAt(i);
		}
		if(str.equalsIgnoreCase(str3)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
	void HelloInDifLang(String country) {
		switch(country.toLowerCase()) {
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Привет");
			break;
		case "italy":
			System.out.println("Ciao");
			break;
		case "south korea":
			System.out.println("여보세요");
			break;
		default:
			System.out.println("Invalid country");
		}
	}
	
}
