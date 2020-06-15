package com.syntax.class32.selfpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkWithExcel {
public static String filePath = System.getProperty("user.dir")+"/TestData/nfl.xlsx";
public static String filePathCreating = System.getProperty("user.dir")+"/TestData/nflCreating.xlsx";

static FileInputStream fis;
static Workbook book;
static Sheet sheet;
static Row row;
static Cell sell;
static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		fis = new FileInputStream(filePath);
		book = new XSSFWorkbook(fis);
		sheet = book.getSheet("Sheet1");
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();
		
		List<Map<String,Object>> listM = new ArrayList<>();
		
		for(int r=1; r<rows; r++) {
			Map<String,Object> mapOur = new LinkedHashMap<>();
			for(int c=0; c<cols; c++) {
			String key = sheet.getRow(0).getCell(c).toString();
			Object value = sheet.getRow(r).getCell(c);
			mapOur.put(key, value);
			}
			listM.add(mapOur);
		}
		System.out.println(listM);
		
		
		
		Workbook bookCreating = new XSSFWorkbook();
		Sheet sheetCreating = bookCreating.createSheet("nfl");
		
		for(Map<String,Object> list: listM) {
			//sheet.createRow(arg0)
			Set<String> keys = list.keySet();
		}
		
		
		fos = new FileOutputStream(filePathCreating);
		
		
		
	}
}
