package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
	
		double d=10;
		System.out.println(d);// 10.0 - process of CASTING
		//conversion of one type into another 
		//Primitive and non-primitive casting
		//two types of casting:
		//1. widening (implicit casting, automatically)
		//byte > short > int > long > float > double
		
		
		
		//2. narrowing (explicit casting, manually) 
		// Explicitly implementing
		//backwards
		int i=(int)10.99;
		System.out.println(i);
		
		byte b = (byte)1284;
		System.out.println(b);
		
	}

}
