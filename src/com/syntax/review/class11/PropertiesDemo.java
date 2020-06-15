package com.syntax.review.class11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		String filePath = "/Users/robespierre/eclipse-workspace/Selenium/configs/demo.properties";
		System.out.println(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();

		prop.load(fis);
		// 1st way. Get the value as object and downcast to String
		String firstName = (String) prop.get("FirstName");
		System.out.println("lastName -> " + firstName);
		// 2nd way. Get the value as a String

		String lastName2 = prop.getProperty("LastName");
		System.out.println("lastName2 -> " + lastName2);

		String school = prop.getProperty("School|Syntax");
		System.out.println("School|Syntax ->" + school);

		// 1st way Get age as a String
		String age = prop.getProperty("Age");
		String age4 = (String) prop.get("Age");
		System.out.println(age);
		// 2nd age as Object

		// Integer age3 = (Integer) prop.get("Age");
		// int age2 = (int) prop.get("Age");

		// Add more key value pairs
		prop.setProperty("StudentNumber", "121212");
		// Or we can override
		prop.setProperty("FirstName", "Bill");
		System.out.println(prop);

		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "");

	}

}
