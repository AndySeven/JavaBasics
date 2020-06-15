package com.syntax.repl;

public class Repl79RetrieveElements2DArray {
	public static void main(String[] args) {
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			for(double[] x:a){
			  for(double y:x){
			    System.out.print(y+ " ");
			  }
			  System.out.println();
			}
			
			System.out.println("==========");
			
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}

}
