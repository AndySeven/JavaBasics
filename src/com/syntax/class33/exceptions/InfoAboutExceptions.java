package com.syntax.class33.exceptions;

public class InfoAboutExceptions {

	public static void main(String[] args) {

		String str = "Hello";

		try {
			char character = str.charAt(10);  //new StringIndexOutOfBoundsException
			System.out.println(character);
		} catch (StringIndexOutOfBoundsException se) {
			// to get info about exception
			//se.printStackTrace();  // name message about E where it occurs
			 System.out.println(se);  // name message about E
			// System.out.println(se.getMessage());  // message String index out of range: 10
		}
		
		System.out.println("=======End of the Program=======");

	}

}
