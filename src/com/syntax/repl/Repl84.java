package com.syntax.repl;

public class Repl84 {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int i=0;
			for(int[] x:a){
			  for(int y:x){
			    
			    if(y<0 && y%2!=0){
			      i++; 
			    } 
			  }  
			}
			System.out.println(i);
			
			//=================================
			
			int countNegative = 0;
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a[j].length; k++) {
					if (a[j][k] < 0 && a[j][k] % 2!=0) {
						countNegative = countNegative+k;
					}
				}
			}
	     System.out.println(countNegative);
	}
}
