package com.syntax.repl;
import java.util.Scanner;
//Write code that will take in a String input and check to see if it is a palindrome or not.
//A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
//Examples of palindromes:
//racecar
//was it a car or a cat I saw
//never odd or even
//rats live on no evil star
//Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
//Your program will print out "true" if it's a palindrome and "false" if not.
public class Repl97 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	    int l=givenString.length()-1;
	    String rev="";
	    for(int i=l; i>=0; i--){
	      rev=rev+givenString.charAt(i);
	    }
	    rev=rev.toLowerCase().replace(" ","");
	    if(givenString.toLowerCase().replace(" ","").equals(rev)){
	      System.out.println(true);
	    }else{
	      System.out.println(false);
	    }
	    
	    givenString=givenString.replace(" ", "");
	    String reversedString="";
		
		for (int i=givenString.length()-1; i>=0; i--) {
			reversedString=reversedString+givenString.charAt(i);
		}

		boolean isPalindrome=false;
		
		if(givenString.equalsIgnoreCase(reversedString)) {
			isPalindrome=true;
		}
		
		System.out.println(isPalindrome);
	    
	    
	    
inp.close();

	}

}
