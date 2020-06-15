package com.syntax.repl;

public class Repl88 {

	public static void main(String[] args) {
		// Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
		// Create String str2=  SYNTAX TECHNOLOGIES and convert into syntax technologies
		 String str1="syntax technologies and convert into SYNTAX TECHNOLOGIES";
		    String str2="SYNTAX TECHNOLOGIES and convert into syntax technologies";
		    
		    str1 = str1.replaceAll("[a-z]","").trim();
		    str2 = str2.replaceAll("[a-z]","").toLowerCase();
		    System.out.println(str1);
		    System.out.println(str2);
	}
}
		
