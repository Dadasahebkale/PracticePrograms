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

public class ExcelData {
	DataFormatter df=new DataFormatter();
	@Test(dataProvider = "driveTest")
	public void getTest(String firstName, String lastName, int std) {
		System.out.println(firstName+" : "+lastName+" : "+std);
	}
	@DataProvider(name="driveTest")
	public Object[][] getData() {
		Object [][] data= {{"Ganesh"," Kale",10},{"Oviya","Kale",9},{"Pranavi","Kale",9},{"Pranav","Kale",7}};
		return data;
	}
	@Test(dataProvider ="test")
	public void test2(String name, String lastname, String company,int id) {
		System.out.println(name+" : "+lastname+" : "+company+" : "+id);
		
	}
	@DataProvider(name="test")
	public Object[][] dataDetails() {
		Object[][] d= {{"Dadasaheb","Kale","Coforge",87545},{"Sachin","Tendulkar","MRF",8945},{"Rahul","Dravid","BSNL",56545},{"Virat","Kohli","RCB",18}};
		return d;
	}
	@Test(dataProvider="data")
	public void secondTest(String name, int ph) {
		System.out.println(name+" : "+ph);
	}
	@DataProvider(name="data")
	public Object[][] data() {
		Object[][]dd= {{"dadasaheb@abc.com",904965950},{"abc@pqr.com",797798},{"qwer@bvn.com", 68768}};
		return dd;
	}
	@DataProvider(name="excel")
	public Object[][] excelTest() throws IOException {
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
				XSSFCell cell=row.getCell(j);
				df.formatCellValue(cell);
				data[i][j]=df.formatCellValue(cell);
			}
			workbook.close();
		}
		return data;
	}
	@Test(dataProvider ="excel")
	public void ExcelDataDemo(String name, String company, String ph) {
		System.out.println(name+" : "+company+" : "+ph);
	}

}
