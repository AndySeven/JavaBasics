package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir")+"/TestData/TestData2.xlsx";
		System.out.println(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		Workbook book = new XSSFWorkbook(fis);
		
		// writing to existing sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(12).setCellValue("CHALLANGE");
		sheet.createRow(4).createCell(0).setCellValue("HICHEM");
		
		Sheet customSheet = book.createSheet("Bombo");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		book.write(fos);
		
	}
}
