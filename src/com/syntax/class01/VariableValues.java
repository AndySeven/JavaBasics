package com.syntax.class01;

public class VariableValues {

	public static void main(String[] args) {
		
		// declaring and assigning variables
		
		byte b = 127;          			        
		short s = 32767;       		         
		int i = 2_147_483_647;           	 
		long l = 9_223_372_036_854_775_807L; 
		float f = 17.99F;		               
		double d = 15.99;					 
		char ch1, ch2;	
		ch1 = 'G';
		ch2 = 'U';						 
		boolean bo1, bo2;
		bo1 = true;
		bo2 = false;	
		
		// variables with updated values
		
		b = -128;          			        
		s = -32768;       		         
		i = -2_147_483_648;           	 
		l = -9_223_372_036_854_775_808L; 
		f = -17.99F;		               
		d = -15.99;					 
		ch1 = 'B';						 
		ch2 = 'Y';						 
		bo1 = false;   				 
		bo2 = true;	
		
		// Printing reassigning value of each variable
		
		System.out.println("byte:     " + b);
		System.out.println("short:    " + s);
		System.out.println("int:      " + i);
		System.out.println("long:     " + l);
		System.out.println("float:    " + f);
		System.out.println("double:   " + d);
		System.out.println("char:     " + ch1);
		System.out.println("char2:    " + ch2);
		System.out.println("boolean:  " + bo1);
		System.out.println("boolean2: " + bo2);

	}

}
