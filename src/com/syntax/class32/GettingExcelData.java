package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingExcelData {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+"/TestData/DataForFirstListMap.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		Sheet firstSheet = book.getSheetAt(0);
		Iterator<Row>iter = firstSheet.iterator();
		//List<Map<String, String>> listMaps = new ArrayList<>();
		while(iter.hasNext()) {
			//Map<String, String> map = new LinkedHashMap<>();
			Row nextRow = iter.next();
			Iterator<Cell> cellIter = nextRow.cellIterator();
			while(cellIter.hasNext()) {
				Cell cell = cellIter.next();
				System.out.print(cell.getStringCellValue()+" \t\t");
			}
			System.out.println();
		}
		
	}

}
