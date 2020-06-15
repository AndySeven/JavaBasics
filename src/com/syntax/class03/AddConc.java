package com.syntax.class03;


public class AddConc {

	public static void main(String[] args) {

		int a=10, b=20;
		String x = "Hello", y = "Bye";
		
		System.out.println(a + b + x + y);
		
		System.out.println(a + x + b + y);
		
		System.out.println(x + y + a + b); 
		
		System.out.println(x + y + (a + b));
		
		System.out.println(a + " " + b + x + y);

	}

}