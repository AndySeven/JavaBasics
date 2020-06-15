package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InHomeTaskReadFromExcel {
	public static void main(String[] args) throws IOException {
		String filePath = "configs/Read.xlsx"; 
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wbook = new XSSFWorkbook(fis);
		
		Sheet sheet = wbook.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				String value = sheet.getRow(i).getCell(j).toString();
				System.out.println(value);
			}
			System.out.println();
		}
		wbook.close();
		fis.close();
	}
}
