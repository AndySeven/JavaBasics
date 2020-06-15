package com.syntax.class01;

public class PrimitiveDataTypes {
	
	public static void main (String[] args) {
		
		byte _variableOne = 127;          		     // from -128    
		short $variableTwo = 32767;       		     // from -32768
		int variable3 = 2_147_483_647;           	 // from 2147483647
		long variable4 = 9_223_372_036_854_775_807L; // from too large negative value
		float variable$Five = 12.99F;	    		 // from 
		double variableSix = 132.99;
		char singlValue = 'G';
		char anotherValue = 'U';
		boolean opPo = true;
		boolean opPa = false;
		
		System.out.println("byte: " + _variableOne);
		System.out.println("short: " + $variableTwo);
		System.out.println("int: " + variable3);
		System.out.println("long: " + variable4);
		System.out.println("float: " + variable$Five);
		System.out.println("double: " + variableSix);
		System.out.println("char: " + singlValue);
		System.out.println("char2: " + anotherValue);
		System.out.println("boolean: " + opPo);
		System.out.println("boolean2: " + opPa);
	}
	
}

