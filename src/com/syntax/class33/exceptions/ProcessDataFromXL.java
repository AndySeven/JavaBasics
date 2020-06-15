package com.syntax.class33.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFromXL {
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+"/TestData/nfl.xlsx";
		System.out.println(filePath);
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		
		String s = sheet.getRow(1).getCell(1).toString();
		System.out.println(s);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		List<Map<String, String>> xlData = new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int c=0; c<cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			xlData.add(map);
			
		}
		System.out.println(xlData);
	}
}
