package com.syntax.class04;

import java.util.Scanner;

public class Task16Repl {

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any number");
	    int i = sc.nextInt();
	    int j = i%2;
	    if(j == 0){
	    	sc.close();
	      System.out.println("Value is even");
	      if(i>1000){
	        System.out.println("Even value is large");
	      }else{
	        System.out.println("Even value is just right");
	      }
	    }else{
	      System.out.println("Value is odd");
	    }
	  }
	}