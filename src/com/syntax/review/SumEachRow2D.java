package com.syntax.review;

public class SumEachRow2D {

	public static void main(String[] args) {
		int[][] array = {{4,5,7,2},
				      	{6,9,3,5,5},
				      	{88,4,3}};
		int[] su = new int[array.length];
		
	int sum=0, i=0;
		for (int[] ro: array) {
			for(int el: ro) {
				
				sum+=el;
			}
			System.out.println(sum);
			su[i]=sum;
			sum=0;
			i++;
		}
		System.out.println(su[1]);
		
	}

}
