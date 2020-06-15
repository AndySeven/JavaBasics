package com.syntax.class11;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String school=" Syntax";
		String str = new String("Hello");
		//String strq="This a String 7676,'13,";
		
		//number of elements
		int elements = school.length();
		System.out.println("characters school: " +elements);
		System.out.println("characters str: " +str.length());
		
		// convert string to lower case or upper case
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase(); //assigning to the same variable
		System.out.println(str);
		
		
		//Concatenate 2 string
		String str2 = str+school; //with assigning to new String
		System.out.println(str2);
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date); // with method concat() you cannon use 
		System.out.println(newDate);	// with char and any other type
		
		//char grade='A';
		//String str3="Student";
		// it is not possible to use str3=concat(grade);
		
		System.out.println("======Empty Function=========");
		
		String str4 = "";
		boolean empty=str4.isEmpty();
		System.out.println(empty);
		
		System.out.println("========trim() FUNCTION");
		
		
		String str5="   Welcome to Syntax!     ";
		str5=str5.trim(); // print without spaces
		System.out.println("without spaces: "+ str5);
		
	}

}
