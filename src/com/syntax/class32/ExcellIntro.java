package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellIntro {

	public static void main(String[] args) throws IOException {
	
		String filePath = "/Users/robespierre/Downloads/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		//access workbook Test.xlsx
		Workbook wbook = new XSSFWorkbook (fis);
		// accessing sheet
		Sheet sheet = wbook.getSheet("Sheet1");
		
		// accessing row
		Row row1 = sheet.getRow(0);
		// accessing sell
		Cell cell = row1.getCell(1); 
		// get value from cell
		String r1cell2 = cell.toString();
		System.out.println(r1cell2);  // lastName
		
		// how to get New York
		Row row3 = sheet.getRow(2);
		Cell r3c3 = row3.getCell(2);
		String cellValue = r3c3.toString();
		System.out.println(cellValue);
		
		// access VA
		cellValue = sheet.getRow(1).getCell(3).toString();
		System.out.println(cellValue);
		
		// to retrieve values based on type
		double cellV = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellV);
		
		// how to get 20151 in a String format
		String valC = sheet.getRow(1).getCell(4).toString();
		String[] arr = valC.split("\\.");
		System.out.println(arr[0]);
		
		
	}
}
