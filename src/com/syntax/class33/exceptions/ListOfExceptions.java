package com.syntax.class33.exceptions;
// Create a static method that will 

import java.io.FileInputStream;

// return a List of Exceptions.
// Inside your method create objects of 4 
// exception classes using try and catch blocks and store 
// them inside your list.
// Call your method inside main and print name 
// and details of all Exception objects.

import java.util.ArrayList;
import java.util.List;

public class ListOfExceptions {

	public static List<Exception> getList() {
		List<Exception> eList = new ArrayList<>();

		try {
			int a = 10 / 0;
		} catch (Exception ae) {
			eList.add(ae);

		}

		String str = "";
		try {
			System.out.println(str.charAt(2));
		} catch (Exception aioobie) {
			eList.add(aioobie);
		}

		String filePath = "";
		try {
			FileInputStream fis = new FileInputStream(filePath);
		} catch (Exception fnfe) {
			eList.add(fnfe);
		}

		int[] array = { 1, 2, 3 };
		try {
			int v = array[4];
		} catch (Exception aioobe) {
			eList.add(aioobe);
		}

		Object b = new Double(5.0);
		try {
			Integer in = (Integer) b;
		} catch (Exception cce) {
			eList.add(cce);
		}
		return eList;
	}

	public static void main(String[] args) {
		System.out.println("-------------List of Exceptions-----------");

		List<Exception> a = getList();
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
