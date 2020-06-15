package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InHomeTaskWriteExcel {

	public static void main(String[] args) throws IOException {
		String filePath = "configs/read.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		@SuppressWarnings("resource")
		Workbook wbook = new XSSFWorkbook(fis);
		
		Sheet sheet = wbook.getSheet("Sheet1");
		sheet.createRow(5).createCell(0).setCellValue("Apricot");
		sheet.getRow(5).createCell(1).setCellValue("King-Kong");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		wbook.write(fos);
		fos.close();
		

	}

}
