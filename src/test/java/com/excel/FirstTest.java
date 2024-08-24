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

public class FirstTest {
	
	
	 
	DataFormatter dataformat=new DataFormatter();
	@DataProvider(name="drivenTest")
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
				dataformat.formatCellValue(cell);
				data[i][j]=dataformat.formatCellValue(cell);
			}
		
		}
		workbook.close();
		return data;
	}
	@Test(dataProvider ="drivenTest")
	public void ExcelData(String name, String company, String ph) {
		System.out.println(name+" : "+company+" : "+ph);
	}
	@DataProvider(name="dk")
	public Object[][] getData() {
		Object d[][]= {{"Dadasaheb","Kale","dada"},{"Oviya","Kale","dkkd"}};
		return d;
	}
	@Test(dataProvider="dk")
	public void t(String name, String lastName,String nickname) {
		System.out.println(name+" : "+lastName+" : "+nickname);
	}
	@DataProvider(name="ovi")
	public Object[][] getDetails() throws IOException {
	
		String u="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
		FileInputStream fis=new FileInputStream(u);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sample");
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object[][] d =new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell=row.getCell(j);
				dataformat.formatCellValue(cell);
				d[i][j]=dataformat.formatCellValue(cell);
			}
		}
		wb.close();
		return d;
	}
	@Test(dataProvider="ovi")
	public void DataTest(String name, String company, String num) {
		System.out.println(name+" : "+company+" : "+num);
	}
	@DataProvider(name="pranav")
	public Object[][] ExcelTestData() throws IOException {
		String url="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
		FileInputStream fis=new FileInputStream(url);
		XSSFWorkbook work=new XSSFWorkbook(fis);
		XSSFSheet sheet=work.getSheet("Data");
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object[][] data=new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell=row.getCell(j);
				dataformat.formatCellValue(cell);
				data[i][j]=dataformat.formatCellValue(cell);
			}
		}
		work.close();
		return data;
	}
	@Test(dataProvider="pranav")
	public void test(String name, String phone, String email) {
		System.out.println(name+" : "+phone+" : "+email);
		
	}
}
