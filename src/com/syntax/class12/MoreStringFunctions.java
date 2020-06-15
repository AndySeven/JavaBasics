package com.syntax.class12;
public class MoreStringFunctions {
	public static void main(String[] args) {
		
String me = "I am a good tester";

System.out.println("------------------replace() Function--------");
System.out.println();
// replace old value with new value
String newString = me.replace("a", "c");
System.out.println(newString);

me=me.replace("good", "great");
System.out.println(me);
// if it is not finding matching sequence --> not replace
me=me.replace("Great", "Awsome");
System.out.println(me);

String car = "I have a Toyota";
car = car.replace("Toyota", "Lexus");
System.out.println(car);

System.out.println("------------------replaceAll() Function--------");
System.out.println();
String str = "Phone number is 1234567890";
str = str.replaceAll("[2-6]", " BOS ");
System.out.println(str);
String str2 = "Bobby is a GOOD boy, he is 789 years Old";
str2 = str2.replaceAll("[A-za-z]", "!");
System.out.println(str2);
String str3 = "Hello1312^%%^$#54&^57$$$$3%^&4867*(jhgfJHGjd2";
str3 = str3.replaceAll("[^$Ha-z]", " ");
System.out.println(str3);
String str4 = "Hello1312^%%^$#54&^57$$$$3%^&4867*(jhgfJHGjd2";
str4 = str4.replaceAll("[$%^#*(]", "");
System.out.println(str4);

String subject = "Java";
subject= subject.replace("a", "e").replace("J", "I").toUpperCase();
System.out.println(subject);
System.out.println(subject.replaceFirst("E", "g"));



	}

}
