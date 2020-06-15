package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
		
		String[] students=new String[3];
		try {
		students[0]="Bob";
		students[1]="Charlie";
		students[2]="Mike";
		students[3]="John";   // --> will get ArrayOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Catch:");
			System.out.println(ex);
		}
		finally {
		System.out.println("System:");	
		System.out.println(students[2]);
		}
	
		String[] students2=new String[5];
		
		
		students[1]="Charlie";
		students[2]="Mike";
		
		System.out.println("Output is gonna be null: " +students2[0]);

		
	String[] syntaxClasses = {"SDLC","ManualTesting","Java","GIT"};
		System.out.println("Today we have a "+syntaxClasses[2]+" class");
}
}
