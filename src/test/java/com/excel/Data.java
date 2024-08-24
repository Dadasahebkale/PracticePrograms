package com.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
//	public static XSSFRow row;
//	public static XSSFSheet sheet;
//	 public static XSSFWorkbook workbook;
//	 public static XSSFCell cell;
//	 public static String url="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
//	public static FileInputStream fis;
	public static DataFormatter dataformat=new DataFormatter();
	public static void main(String[] args) throws IOException {
		String url="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
		FileInputStream fis=new FileInputStream(url);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell	cell=row.getCell(j);
				dataformat.formatCellValue(cell);
		System.out.println(data[i][j]=dataformat.formatCellValue(cell));
			}
			
		}
		workbook.close();
	}

}
