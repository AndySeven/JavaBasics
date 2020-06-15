package com.syntax.repl;

public class Repl69Pattern {

	public static void main(String[] args) {
		 for(int i=8; i>1; i--){
		      for(int j=1; j<=i-1; j++ ){
		        System.out.print(j);
		      }
		      System.out.println();
		 }
		 
		 for(int i=1; i<7; i++) {
			 for(int j=1; j<=i+1; j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 
		 for (int i = 7; i >= 1; i--) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	         
	        //Printing lower half of the pattern
	         
	        for (int i = 2; i <= 7; i++) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	}
}
