package com.syntax.teamwork;
public class Task01Swab2Numbers {
	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers 
		// without a temporary variable? 
		// Swap 2 strings without a temporary variable?
		
		// Integers
		int num1 = 6;
		int num2 = 17;
		System.out.println("num1 & num2 before manipulations "
				+ "respectively equal: " +num1+" & "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 & num2 before manipulations "
				+ "respectively equal: " +num1+" & "+num2);
		
		// Strings 1st method:
		String str1 = "box";
		String str2 = "wax";
		System.out.println("str1 & str2 before manipulations "
				+ "respectively equal: " +str1+" & "+str2);
		
		str1 = str2 + str1;
		str2 = str1.substring(str2.length());
		str1 = str1.substring(0,(str1.length()-str2.length()));
		System.out.println("str1 & str2 after manipulations "
				+ "respectively equal: " +str1+" & "+str2);
		
		// Strings 2nd method swapping back:
		int str1l=str1.length();
		str1 = str1 + str2;
		str2 = str1.substring(0,str1l);
		str1 = str1.substring(str1l);
		System.out.println("str1 & str2 after manipulations "
				+ "respectively equal: " +str1+" & "+str2);
		
		// Strings 3rd method:
		
		
		str2 = str2.toUpperCase();
		str1 = str1.concat(str2);
		
		String[] splitted = str1.split("W");
				for(String spl:splitted) {
					System.out.println(spl);
				}
		
		// Strings 4
				
		String st1 = "Hello";
		String st2 = "Bye";
		
		String sto = st1+st2;
		st1 = sto.replace(st1,"");
		st2 = sto.replace(st2,"");
		
		System.out.println(st1);
		System.out.println(st2);
		
		
		
	}

}
