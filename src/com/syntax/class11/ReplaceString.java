package com.syntax.class11;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "1239872!#@%#$%@$#?sdfasdf1982543&%^$3479jdshdfdsf234234fjsch gsfgs%$$$&^";
		
		System.out.println(str.replaceAll("[^0-9]"," "));
		
		
		String subject="I love Java and I want to learn more";
		// Using space “ ” as a delimiter 
		//Split returns an array of Strings
		String [] splittedSub = subject.split(" ");
		System.out.println(splittedSub.length);
		//Looping through the array to get all the values
		for (int i = 0; i< splittedSub.length; i++) {
			System.out.println(splittedSub[i]);}
	}

}
