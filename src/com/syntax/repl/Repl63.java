package com.syntax.repl;

import java.util.Scanner;

public class Repl63 {

	  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		     int x = inp.nextInt();
		   for(int i = 0; i<x; i++){
		     System.out.print(i+" ");
		   }
		   inp.close();
		    
		  }
		}