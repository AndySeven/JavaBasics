package com.syntax.class12;
public class RecapStrings {

	public static void main(String[] args) {
		
		String str = ""; //empty value
		System.out.println(str.isEmpty());
	    // String str1 = null; //no value at all
		// System.out.println(str1.isEmpty()); //RunTime error	
		
		String str2 = "   Good Morning";
		String str3 = "students";
		String str4 = "!";
		
System.out.println("-------concat() and trim()--------");
// "   Good Norning"-->"Good Morning"-->"Good Morningstudents"-->"Good Morningstudents!"
		str2 = str2.trim().concat(str3).concat(str4);
		System.out.println(str2);
		
		// String str5 = "Day";
		// int Date = 25;
		// str5.concat(date); CE: change type

System.out.println("-------spaces trim() at the beginning or at the end---------");		
		String str6 = " Hello ";
		String str7 = "Syntax";
		
		str6=str6.concat(str7).trim();
		System.out.println(str6); //Hello Syntax
		
		String str8 = " Hello ";
		String str9 = "Syntax"; 
		
		str8=str8.trim().concat(str9);
		System.out.println(str8); //HelloSyntax
		
	}
}
