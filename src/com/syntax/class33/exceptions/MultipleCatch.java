package com.syntax.class33.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {
		String file = System.getProperty("user.dir")+"/configs/configuration.propertie";

		try {
			FileInputStream fis = new FileInputStream(file); // new FileNotFoundException
			fis.close();
			Properties prop = new Properties();
			prop.load(fis);       							 // new IOException
		} catch (FileNotFoundException e) {   
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {  // always gets executed
			System.out.println("I am finally block");
		}
		
		System.out.println("------End of Program------");
	}
}
