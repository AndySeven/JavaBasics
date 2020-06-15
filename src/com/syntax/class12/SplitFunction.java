package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		
System.out.println("-------------------------split() FUNCTION----------");

String today = "Today is my favorite Java Class";
String[] array = today.split("my");
System.out.println(array.length);
System.out.println(array[0]);
System.out.println(array[1]);

System.out.println("-----------------------------");
//print all elements from array 1 by 1
String today1 = "Today is my favorite Java Class";
String[] stringArray = today1.split("a");
for(String arr:stringArray) {
	System.out.println(arr+" ");
}

System.out.println("-----------------------------");
String today2 = "Today is my favorite Java Class";
String[] stringArray1 = today2.split(" ");

for(String arr1:stringArray1) {
	System.out.println(arr1+" ");
}

for(int i=0; i<stringArray1.length; i++) {
	System.out.println(stringArray1[i]);
}

System.out.println("-------------------------------------------");

String today3="Today is my favorite Java class";
today3 = today3.trim();
System.out.println(today3);

//today3 = today3.split(" "); CE type missmatch -->split will give you back array of strins




	

}
}
