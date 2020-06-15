package com.syntax.class03;

public class DoubleComparison {

	public static void main(String[] args) {
		double d = 10.2, e = 10.2;
		
		if (d > e) {
			System.out.println("Double value " + d + " is larger than " + e);	
		} else if (d < e) {
			System.out.println("Double value " + d + " is smaller than " + e);
		} else {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("--------------------------------");
		
		int day = 10;
		
		if(day==1) {
			System.out.println("It's Monday no class today");
		}else if(day==2) {
			System.out.println("It's Tuesdy we have SDLC Class");
		}else if(day==3) {
			System.out.println("It's Wednesday we have SDLC Class");
		}else if(day==4) {
			System.out.println("It's Thursday we have Review Class");
		}else if(day==5) {
			System.out.println("It's Friday no class today");
		}else if(day==6) {
			System.out.println("It's Saturday we have Java Class");
		}else if(day==7) {
			System.out.println("It's Sunday we have Java Class");
		}else {
			System.out.println("It's Invalid weekday");
		}
	
	}
}
