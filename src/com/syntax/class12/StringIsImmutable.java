package com.syntax.class12;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		String str ="Hello";
		String str1 = "Hello";
		String str2 = "World";
		
		str.concat(str2);
		System.out.println(str); //print just "Hello"
		
		str1 = str1.concat(str2);
		System.out.println(str1); //HelloWorld - new Object
		
		str1 = str1.toUpperCase(); // new object new place of memory id in debug mode
		System.out.println(str1);
		
		str1 = str2;
		System.out.println(str1); // "World"
		
	

	}

}
