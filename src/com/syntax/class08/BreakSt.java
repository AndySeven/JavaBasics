package com.syntax.class08;

public class BreakSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =1; i<=10; i++) {
			
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println("im inside loop");
		System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		System.out.println("-----------CONTINUE-----------");
	
		for(int y=1; y<=10; y++) {
			if(y==4) {
				System.out.println("I am skipping iteration");
				continue;
			}
			System.out.println("im inside loop");
			System.out.println(y);
		}
		
		
}
	

}
