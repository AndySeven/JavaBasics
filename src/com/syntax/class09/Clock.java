package com.syntax.class09;

public class Clock {

	public static void main(String[] args) {
		

		for(int a=0; a<2; a++) {
			for(int b=0; b<10; b++) {
				if(a==1 && b>1) {
					break;
				}
				for(int c=0; c<6; c++) {
					for(int d=0; d<10; d++) {
						
						System.out.println(a+""+b+":"+c+""+d);
					}
				}
			}
		}

	
	}

}
