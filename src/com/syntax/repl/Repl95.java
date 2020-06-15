package com.syntax.repl;

public class Repl95 {

	public static void main(String[] args) {
		 String str = "Hello Syntax friends";
		    str = str.substring(6,12);
		    String str1="Welcome "+str+" family";
		    System.out.println(str1);
		    
		    
			String given="Hello Syntax friends";
			
			given=given.replace("Hello", "Welcome").replace("friends", "family");
			
			System.out.println(given);
	}

}
