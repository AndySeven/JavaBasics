package com.syntax.teamwork;

public class Task06PalindromeString {

	public static void main(String[] args) {
		// Write a Java Program to find whether a 
		// String is palindrome or not?

		String str = "A Santa Lived As a Devil At NASA";
		
		String str1 = str.substring(0, str.length()/2-1).replace(" ", "").toLowerCase();
		String str2 = str.substring(str.length()/2).replace(" ", "").toLowerCase();
		String str3 = "";
		for(int i=str2.length()-1; i>=0; i--) {
			str3+=str2.charAt(i);
		}
		if(str1.equals(str3)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}	
		
		//second doesn't work
		
//		  String rev = "";
//	      for ( int i = str.length() - 1; i >= 0; i-- )
//	         rev = rev + str.charAt(i);
//	      System.out.println(rev);
//	      System.out.println(str);
//	      if (str.equals(rev))
//	         System.out.println(str+" is a palindrome");
//	      else
//	         System.out.println(str+" is not a palindrome");
//	      
	      //third
	      String st = "";
	      for(int i=str.length()-1; i>=0; i--) {
	    	  st=st + str.charAt(i);
	      }
	      str=str.replace(" ", "").toLowerCase();
	      st=st.replace(" ", "").toLowerCase();
	      
	      if(str.equals(st)) {
				System.out.println("String is palindrome");
			}else {
				System.out.println("String is NOT palindrome");
			}	
		
	}
}
