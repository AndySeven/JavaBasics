package com.syntax.repl;

public class Repl83SumRowElements2D {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
	    int sum=0;
			int[] b = new int[4];
			for(int i=0; i<a.length; i++){
			  for(int j=0; j<a[i].length; j++){
			    sum+=a[i][j];
			    b[i]=sum; 
			  }
			  sum=0;
			}
			for(int	x:b){
			    System.out.println(x);
			  }
			
//========================================================
			System.out.println("===========================");
		
			int sums[] = new int[a.length];
			
			for (int i = 0; i < a.length; i++) {
				int rowSum = 0;
				for (int j = 0; j < a[i].length; j++) {
					rowSum += a[i][j];
				}
				sums[i] = rowSum;
			}

		for(int som : sums) {
				System.out.println(som);
	  }
			
			
			
			
			}

	}


