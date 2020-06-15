package com.syntax.class19;

public class ConstructorCall {
	public ConstructorCall() {
		System.out.println("I am non argument constructor");
	}
	public ConstructorCall(String str) {
		this(); //call the current class(of the same class) constructor 
		System.out.println(str);  
	}
	
	public ConstructorCall(String str, String str1) {
		this("Hello");
		// this("Hello","Hi");CE trying to make a call to another that accept 
		// two parameters
		// this(12);CE there are no constructor accepting integer parameters
		// this(str); also good "Java" string will be passed to the str
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConstructorCall obj = new ConstructorCall("Java","Love");
		
	}

}
