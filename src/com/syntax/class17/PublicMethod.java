package com.syntax.class17;

public class PublicMethod {
//	Create a method that will take a String as a parameter 
//	and returns reverse String. Method should be available 
//	to all classes within your projects and accessible by class name.
	
	public static String getReverse(String str) {
		String str1="";
		for(int i=str.length()-1; i>=0; i--) {
			str1+=str.charAt(i);
		}
		return str1;
	}
}


