package com.syntax.class05;

public class LocalNot {

	public static void main(String[] args) {
		// NOT - reverse your condition
		
		boolean b = !true;
		boolean val = !false;
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold = true;
		if (!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		String day1 = "Tuesday";
		
		
		if (!(day1.equals("Monday") && day1.equals("Friday"))) {
			System.out.println("im at Syntax");
		}
		
		if (!day1.equals("Monday") && !day1.equals("Friday")) {
			System.out.println("im at Syntax");
		
		}
	}
}
