package com.syntax.class08;

public class SumOddAndSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, sumO = 0, sumE = 0;
		
//		for(i = 1; i<=99; i+=2) {
//			sumO = sumO + i;
//		}
//		System.out.println(sumO);
//		
//		for(i=2; i<=99; i+=2) {
//		sumE=sumE+i;
//		}
//		System.out.println(sumE);
		
		for(i = 1; i<=99; i++) {
			if(i%2==0) {
				sumE=sumE+i;
			}else {
				sumO = sumO + i;
			}
		}
		System.out.println(sumE);
		System.out.println(sumO);

		
	}

}
