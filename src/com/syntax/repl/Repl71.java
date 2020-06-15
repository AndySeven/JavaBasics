package com.syntax.repl;

public class Repl71 {

	public static void main(String[] args) {
	    int[] array = {45,78,12,67,55,89,23,77,88};
	    for(int x=0; x<array.length; x++) {
	    	if(x%2==0) {
	        System.out.print(array[x]+" ");
	      }
	    }
	    System.out.println();
	    System.out.println("======");
	    for(int x=0; x<array.length; x+=2){
	    	System.out.print(array[x]+" ");
	    }
	}
}

