package com.syntax.class11;

public class StringsCOMPARING {

	public static void main(String[] args) {
		
String str1 = "Hello";									// Preferable assigning 
String str2 = new String("Hello");		
String str3 = "Hello";

if (str1.equals(str3)) {								// comparing objects. Preferable method
	System.out.println("Strings are equal");
}else {
	System.out.println("Strings are not equal");
}

System.out.println("==========Comparing using == Operator ");
// comparing literals

if (str1 == str2) {
	System.out.println("equal");
}else {
	System.out.println("not equal");
}

if (str1 == str3) {
	System.out.println("str1 and str3 are equal");
}else {
	System.out.println("str1 is NOT equal str3");
}




	}

}
