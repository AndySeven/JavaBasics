package com.syntax.class32.selfpractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {
static Row row;
static Cell cell;
	public static void main(String[] args) throws IOException {
	String filePath = System.getProperty("user.dir")+"/TestData/CreatingExcel.xlsx";
	Workbook book = new XSSFWorkbook();
	Sheet sheet = book.createSheet("Details");
	
	List<Map<Object,Object>> listOfMaps = new LinkedList<>();
	Map<Object, Object> map1 = new LinkedHashMap<>();
	map1.put("user", "mashroom");
	map1.put("email", "duck.gmail.com");
	map1.put("status", "active");
	
	Map<Object, Object> map2 = new LinkedHashMap<>();
	map2.put("user", "bee");
	map2.put("email", "bee.gmail.com");
	map2.put("status", "inactive");
	
	Map<Object, Object> map3 = new LinkedHashMap<>();
	map3.put("user", "raccoon");
	map3.put("email", "raccoon.gmail.com");
	map3.put("status", "active");
	
	listOfMaps.add(map1);
	listOfMaps.add(map2);
	listOfMaps.add(map3);
	int rownum = 0;
	int cellnum = 0;
	
	for(Map<Object, Object> map: listOfMaps) {
		Set<Object>setKeys = map.keySet();
		rownum++;
		row = sheet.createRow(rownum);
		for(Object key: setKeys) {
			Object k = key;
			Object value = map.get(k);
			cell = row.createCell(cellnum);
			cell.setCellValue((String)value);
			cellnum++;
		}
		cellnum=0;
		
		
	}
	
	
	//sheet.getRow(5).createCell(5).setCellValue("Manual Cell");
	//sheet.createRow(1).createCell(0).setCellValue("Manual Cell 2");
	
	FileOutputStream fos = new FileOutputStream(filePath);
	book.write(fos);

	
	}	

}
