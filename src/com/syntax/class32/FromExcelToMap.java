package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// get the data from excel and store it into the list of Maps
public class FromExcelToMap {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir")+"/TestData/DataForFirstListMap.xlsx";
		System.out.println(filePath);
		// bring the object of FileInputStream class for reading.
		// Reading from file
		FileInputStream fis = new FileInputStream(filePath);
		// accessing the book/ our xlsx testing file
		Workbook book = new XSSFWorkbook(fis);
		// accessing the sheet, sheet name we pass to the parameter as argument
		Sheet sheet = book.getSheet("Sheet1");
		
		List<Map<String, String>> maps = new ArrayList<>();
		// number of rows
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		
		for(int r=1; r<rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int c=0; c<cols; c++) {
				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			maps.add(map);
		}
		System.out.println(maps);
		
	}

}
