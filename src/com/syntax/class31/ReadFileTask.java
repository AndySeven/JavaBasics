package com.syntax.class31;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ReadFileTask {
	public static void main(String[] args) throws IOException {
		String filePath = "configs/FileTask.properies";
		System.out.println(filePath);
		
		
		// Defining useless part of path
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		// Connect and get vatious Properties user Name and OS
		String userName = System.getProperty("user.name");
		String os = System.getProperty("os.name");
		System.out.println(userName+" "+os);
		String filePath1 = System.getProperty("user.dir")+"/configs/FileTask.properies";
		System.out.println(filePath1);
		
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		Set<Entry<Object, Object>> entries = prop.entrySet();
		System.out.println(entries);
		for(Entry<Object, Object> entry: entries) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			
			
			// adding data to file properties
			prop.setProperty("goose", "Number One");
			FileOutputStream fos = new FileOutputStream(filePath);
			prop.store(fos, "Evereything is good");
			
		}
	}

}
