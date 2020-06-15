package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String message = "Welcome Admin";

//verify message contains username which is Admin
System.out.println("=======contains() fuction");
System.out.println(message.contains("Admin"));
boolean flag=message.contains("welcome");
System.out.println(flag);


//we want to see if welcome starts with Welcome
System.out.println("========starts() fuction");
boolean starts=message.startsWith("Welcome");
System.out.println(starts);

//we want to verify that welcome message ends with username
System.out.println("=====ends() function");
String username="Admin";

boolean ends=message.endsWith(username);
System.out.println(ends);
System.out.println(message.endsWith("!"));

	}

}
