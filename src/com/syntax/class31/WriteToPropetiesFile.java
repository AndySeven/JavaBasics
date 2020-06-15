package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropetiesFile {
	public static void main(String[] args) throws IOException {
		
		String filePath = "configs/Examples.properties";
		System.out.println(filePath);
		//creating new file
		//String filePath = "configs/Examples2.properties";
		FileInputStream fis = new FileInputStream(filePath); // need for keeping previous data in file
		Properties prop = new Properties();
		//to reate new file we don't need to load file
		prop.load(fis); // need for keeping previous data in file
		
		prop.setProperty("phoneNumber", "1234567890");
		FileOutputStream fos = new FileOutputStream(filePath);
		// to keep data in file we need have 15 and 18 lines
		prop.store(fos, "Added additional key");
	}
}
