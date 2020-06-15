package com.syntax.repl;

import java.util.Scanner;

public class Repl64 {

	  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("Int:");
		    int end = inp.nextInt();
		    for(int i=0; i<end*2; i++){
		      if(i>=0){
		        System.out.print(i+" ");
		      }
		    }
		    inp.close();
		    
		  }
		}