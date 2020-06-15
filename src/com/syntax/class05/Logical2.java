package com.syntax.class05;

public class Logical2 {

	public static void main(String[] args) {
		/*  We have total 7 days in a week
		 *  Our Schedule
		 *  
		 *  2,3 - SDLC
		 *  6,7 - JAVA
		 *  1,5 - OFF
		 *  4 - review
		 *  other - invalid
		 */
	
	int day = 6;
	
	if (day==2 || day==3) {
		System.out.println("SDLC");
	}else if (day==6 || day==7) {
		System.out.println("JAVA");
	}else if (day==1 || day==5) {
		System.out.println("OFF");
	}else if (day == 4) {
		System.out.println("REvIEW");
	}else {
		System.out.println("Invalid value");
	}
	
	System.out.println("-----------strings------------------------");
	
	String day1 = "Saturday";
	
	if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
		System.out.println("SDLC");
	}else if (day1.equals("Saturday") || day1.equals("Sunday")) {
		System.out.println("Java");
	}else if (day1.equals("Monday") || day1.equals("Friday")) {
		System.out.println("OFF");
	}else if (day1.equals("Thursday")) {
		System.out.println("review");
	}else {
		System.out.println("invalid input");
	}
	
	
	
	
 	}

}
