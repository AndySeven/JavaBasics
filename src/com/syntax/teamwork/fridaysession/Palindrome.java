package com.syntax.teamwork.fridaysession;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Abba"));
		System.out.println(isPal("Abba"));
		System.out.println(isP("Abba"));

	}
	
	public static boolean isPalindrome(String str) {
		String str2="";
		for(int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
		}
		if(str2.equalsIgnoreCase(str))
			return true;
		return false;
	}
	
	public static boolean isPal(String str) {
		StringBuffer buf = new StringBuffer(str);
		if(buf.reverse().equals(buf))
			return true;
		return false;
		
	}
	public static boolean isP(String str) {
		StringBuilder bui = new StringBuilder(str);
		System.out.println(bui);
		if(bui.reverse().equals(bui))
			return true;
		return false;
					
	}

}
