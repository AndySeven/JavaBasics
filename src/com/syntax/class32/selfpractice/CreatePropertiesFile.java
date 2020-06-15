package com.syntax.class32.selfpractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.Set;
//import java.util.Map.Entry;;

public class CreatePropertiesFile {

	public static void main(String[] args) throws IOException {
		String filePath = "configs/configuration3.properties";
		//FileInputStream fis = new FileInputStream(filePath);  
		//System.out.println(filePath);
		Properties prop = new Properties();
		prop.setProperty("UserName", "Moose");
		prop.setProperty("Email", "moose@yahoo.com");
		prop.setProperty("City", "Brooklyn");
		//prop.
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "Newly created file");
		//Set<Entry<Object, Object>> entriesConfig = prop.entrySet();
		//System.out.println(entriesConfig);
		
	}
}
