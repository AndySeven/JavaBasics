package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		
		for (int i =1; i<5; i++) {
			System.out.println("Good Morning");
		}
		System.out.println("==========");
		
		for (int j = 10; j>=1; j--) {
			System.out.println(j);
		}
		System.out.println("==========");
		
		for(int g = 0; g<=50; g+=5) {
			System.out.println(g);
	}
		System.out.println("==========");
		int sum=0;
		for(int k = 1; k<5; k++) {
			sum=sum+k;
			
		}System.out.println("sum = "+ sum);
}
}