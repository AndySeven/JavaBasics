package com.syntax.review;

public class IndexOfStrings {

	public static void main(String[] args) {
		String str = "Hello my feiends";
		
		int a = str.indexOf("e", 9);
		
		System.out.println(a);
		
		
		char [] charArray = str.toCharArray();
		String reverse ="";
		
		for(int i=0; i<=charArray.length-1; i++) {
			reverse +=charArray[i];
		}
		System.out.println(reverse);

	}

}
