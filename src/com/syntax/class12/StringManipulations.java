package com.syntax.class12;
public class StringManipulations {

	public static void main(String[] args) {
		String str = "Good Morning Students!";
System.out.println("------------------------------charAt()-------"); 		
		char letter1 = str.charAt(0);
		System.out.println(letter1);
		
		char letter5 = str.charAt(4);
		System.out.println("Letter at index 4 is " +letter5+".");
		
		//char someLetter = str.charAt(55); REE -> StringIndexOutOfBoundsException
		//System.out.println(someLetter); 
		
System.out.println("------------------------------get all characters 1 by 1 from a String-------"); 
		char letters;
		for(int i=0; i<str.length(); i++) {
			letters = str.charAt(i);
			System.out.print(letters +"");
		}
System.out.println("------------------------------indexOf()-------"); 

		String name = "Syntax Technologies";
		int index = name.indexOf("y");
		System.out.println(index);
		
		index=name.indexOf(" ");
		System.out.println(index);
		
		index=name.indexOf("Syntax"); //fist occurance "S" - 0
		System.out.println(index);
		
		index=name.indexOf("!");
		System.out.println("index of not existing character: " +index);
		
		index = name.indexOf("Technologies"); //fist occurance "T" - 7
		System.out.println("Index of substring Technologies: " +index);
		
System.out.println("--------------------------lastIndex()-----------");		
		index=name.indexOf("o");
		System.out.println("Index of the first o: " +index);
		
		index = name.lastIndexOf('o');
		System.out.println(index);

	}
}
