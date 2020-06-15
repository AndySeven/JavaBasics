package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/robespierre/Downloads/TestData/Test.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		// get an Object of Workbook type
		Workbook book = new XSSFWorkbook (fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		// need find numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();
		
		// find numbers of columns
		int col = sheet.getRow(0).getLastCellNum();
		
		// get data from all rows and all columns
		for(int i=0; i<rows; i++) {   //iterates overs rows
			for(int j=0; j<col; j++) {
				String cellValue = sheet.getRow(i).getCell(j).toString();
				System.out.print(cellValue+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
