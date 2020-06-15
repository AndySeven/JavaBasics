package com.syntax.repl;

import java.util.Scanner;

public class Repl65 {

	  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int x;
		    System.out.print("In:");
		    x = inp.nextInt();
		    
		    for(int i = x-1; i>=0; i--){
		      System.out.print(i+ " ");
		    }
		    inp.close();
		    
		  }
		}