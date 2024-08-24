package com.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\QAHUB\\DkAutomation\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheet=workbook.getNumberOfSheets();
		for(int i=0;i<sheet;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("Raw_Data")) {
				XSSFSheet sheets=workbook.getSheetAt(i);
				Iterator<Row> rows=sheets.iterator();
				Row firstRow=rows.next();
				Iterator<Cell> cells=firstRow.cellIterator();
				int k=0;
				int column=0;
				while(cells.hasNext()) {
					Cell value=cells.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column=k;
					}
					k++;
				}
				System.out.println(column);
			}
		}
		workbook.close();
	}

}
