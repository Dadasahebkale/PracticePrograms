package com.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeExcel {
	public String url="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
	DataFormatter formatter=new DataFormatter();
	@DataProvider(name="abc")
	public Object[][] getData() throws IOException {
		FileInputStream fis=new FileInputStream(url);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Test_Data");
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object[][]data=new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell=row.getCell(j);
				formatter.formatCellValue(cell);
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;
	}
	@Test(dataProvider ="abc")
	public void getTest(String name, String comp, String city, String phone) {
		System.out.println(name+" : "+comp+" : "+city+" : "+phone);
	}
}
