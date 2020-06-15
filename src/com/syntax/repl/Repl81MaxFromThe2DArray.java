package com.syntax.repl;

public class Repl81MaxFromThe2DArray {

	public static void main(String[] args) {
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
			int max=0;
	  for(int[] x:a){
	    for(int y:x){
	      if(y>max){
	        max=y;
	      }
	    }
	  }
//==================================================================
	  System.out.println(max);
	  int max2=0;
	  for(int i=0; i<a.length; i++) {
		  for(int j=0; j<a[i].length; j++) {
			  if(a[i][j]>max2) {
				  max2=a[i][j];
			  }
		  }
	  }
	  System.out.println(max2);
//==================================================================	  
	  int maxValue = a[0][0];
      for (int j = 0; j < a.length; j++) {
          for (int i = 0; i < a[j].length; i++) {
              if (a[j][i] > maxValue) {
                  maxValue = a[j][i];
              }
          }
      }
      System.out.println(maxValue);

	}

}
