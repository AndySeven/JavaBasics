package com.syntax.class11;

public class StrinValidation {

	public static void main(String[] args) {

		String str1="Welcome Syntax Students";
		String str2="Welcome Syntax students";
		
		// compare 2 strings
		
		System.out.println("===========equals() equalsEgnoreCase() FUNCTION==========");
		
		System.out.println(str1.equals(str2));           // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
	// from web site
	String expected = "Home -Syntax Technologies";
	String actual = "Home -Syntax Technologies ";
	if (actual.equals(expected)) {
		System.out.println("Test case pass. Titles are matched");
	}else {
		System.out.println("Test case fails. Titles are NOT matched");
	}
	// if spaces is not important
	if (actual.trim().equals(expected)) {
		System.out.println("Test case pass. Titles are matched");
	}else {
		System.out.println("Test case fails. Titles are NOT matched");
	}
	
	String browser = "Chrome";
	if(browser.trim().equalsIgnoreCase("chrome")) {
		System.out.println("Test executed on chrome browser");
	}
	// OR
	if(browser.toLowerCase().equals("chrome")) {
		System.out.println("Test executed on chrome browser");
	}
	
	}

}
