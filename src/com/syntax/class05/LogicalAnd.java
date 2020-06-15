package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
//		if declared number is:
//			between 1-10 --> small
//			between 11-100 --> big
//			between 101-1000 --> large

		int num = 78;
		
		if (num>=1 && num<=10) {
			System.out.println("small");	
		}else if (num>=11 && num<=100) {
			System.out.println("big");
		}else if (num>=101 && num<=1000) {
			System.out.println("large");
		}
		
	}

}
