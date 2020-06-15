package com.syntax.class15;

public class MethodsReturningValue {
	public static void main(String[] args) {
		
	
	//create string and based on the length of string
	//define whether String is short or long
	
	String str = "Hello my friends";
	
	int length = str.length();
	if (length>10) {
		System.out.println("String is long");
	}else {
		System.out.println("String is short");
	}
	
	// compare 2 numbers and then we identify 
	// largest number is even or odd
	
	MethodsReturningValue obj = new MethodsReturningValue();
	int num = obj.largest(10, str.length());
	System.out.println("largest is " +num);
	boolean flag = obj.isOdd(num);
	System.out.println(flag);
	
}
	// create method that return largest number from 2 given numbers
	
	int largest(int a, int b) {
		int largest;
		if(a>b) {
			largest = a;
		}else {
			largest = b;
		}
		return largest;
	}
	
	boolean isOdd(int num) {
		boolean isOdd;
		if (num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		
		return isOdd;
	}
}
