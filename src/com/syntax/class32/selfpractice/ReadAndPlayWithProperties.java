package com.syntax.class32.selfpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;


public class ReadAndPlayWithProperties {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") +"/configs/configuration3.properties";
		System.out.println(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String s = (String) prop.get("UserName");
		System.out.println("Value of key(UserName): "+s+"\n");
		
		String s1 = prop.getProperty("Email");
		System.out.println("Value of key(Email) using getProperty: "+s1+"\n");
		
		Collection<Object> setValues = prop.values();
		System.out.println("Set from prop.values(): "+setValues+"\n");
		Set<Object> setKeys = prop.keySet();
		System.out.println("Set from prop.keySet(): "+setKeys+"\n");
		//Collections.sort(setKeys);
		
		Set<Entry<Object, Object>> setEntries = prop.entrySet();
		
		System.out.println("Get keys and values using entrySet: \n");
		for(Entry<Object, Object> entry: setEntries) {
			Object key = entry.getKey();
			Object value = entry.getValue();
	
			System.out.println(key+"-->"+value);
		}
		System.out.println();
		
		prop.entrySet(); //set
		String sw = prop.toString();
		System.out.println("prop.toString(): "+sw);
		System.out.println("simple printing prop: "+prop);
		
	}

}
