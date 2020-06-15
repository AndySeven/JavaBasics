package com.syntax.review.class11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath + "/TestData/ExcelReview.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		//get whole file
		Workbook book = new XSSFWorkbook(fis);
		//get sheet from the file
		Sheet sheet = book.getSheet("Sheet1");
		// get num of rows the last one that has data
		int rows = sheet.getPhysicalNumberOfRows();
		
		// get one row in the current sheet
		Row row0 = sheet.getRow(0);
		// get first cell in the row 0
		Cell cell = row0.getCell(0);
		// get the number of cells in current row
		int cells = row0.getLastCellNum();
		
		for(int i=0; i<cells; i++) {
			String s = row0.getCell(i).toString();
			System.out.println(s);
		}
		
		for(int i=0; i<rows; i++) {
			Row curRow = sheet.getRow(i);
			// How many cells in a row
			int curCells = curRow.getLastCellNum();
			
			for(int j=0; j<curCells; j++) {
				Cell eachCell = curRow.getCell(j);
				String cellData = eachCell.toString(); 
				System.out.print(cellData+" ");
			}
			System.out.println();
		}
		
		
		List<Map<String, String>> xlsxTable = new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			Map<String, String> pairs = new LinkedHashMap<>();
			
			for(int c=0; c<cells; c++) {
				String key = row0.getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				pairs.put(key, value);
		}
			xlsxTable.add(pairs);
		
	}
		System.out.println(xlsxTable);
		
	for(Map<String,String> map: xlsxTable) {
		System.out.println(map);
		Set<Entry<String, String>> setEntry = map.entrySet();
		System.out.println(setEntry);
		for(Entry<String,String> entry : setEntry ) {
			String keys = entry.getKey();
			String values = entry.getValue();
			
			System.out.println(entry);
		}
		System.out.println();
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
