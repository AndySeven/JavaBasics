package com.syntax.repl;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String[] a = new String[7];
	    for(int i=0; i<a.length; i++){
	    System.out.println("Please enter day "+ (i+1) +" of the week");
	    a[i] = sc.nextLine();
	    }
	    for(int j=0; j<a.length; j++){
	    System.out.println(a[j]);
	    }
	    sc.close();
	}


	}


