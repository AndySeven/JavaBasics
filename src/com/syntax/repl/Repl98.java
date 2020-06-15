package com.syntax.repl;

import java.util.Scanner;
// Write a for loop that will print out every other letter in a String,
// starting with the first letter.  
// These letters should be printed all on one line with no space in between.
// Sample input/outputs
// In: hello
// hlo 
// In: SSyynnttaaxxTTeecchhnnoollooggiieess
// SyntaxTechnologies

public class Repl98 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    String w = "";
	    for(int i=0; i<=word.length()-1; i++) {
	      if(i%2!=0){
	        continue;
	      }
	      w = w+word.charAt(i);
	    }
	    System.out.print(w.replace(" ", ""));
	    
	    //2nd way:
	    for(int i=0;i<=word.length()-1;i+=2){
		      System.out.print(word.charAt(i));
		    }
	    
	    inp.close();
	}

}
