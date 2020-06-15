package com.syntax.class33.exceptions;
// For explicitly throw exception mainly custom.
// we can throw either checked or unchecked exc.
public class ThrowException {
	
	public static void throwExc(int a) {
		if (a<18) {
			throw new ArithmeticException("age");
		}else {
			System.out.println(" Welcome to vote");
		}
	}
	

	public static void main(String[] args) {
		try {
		throwExc(16);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}

	}

}
