package com.syntax.class14;

public class MethodExamples {
void greet() {
		
		System.out.println("Hello Everybody");
}
	void greet1(String name) {
		
		System.out.println("Hello "+name);
	}
	
	
	public static void main(String[] args) {
		
		MethodExamples mE = new MethodExamples();
		mE.greet1("Arthur");
		mE.greet1("Greg");
		mE.greet1("Goga");
		mE.greet1("Albert");
		mE.greet();
		
	}
}
