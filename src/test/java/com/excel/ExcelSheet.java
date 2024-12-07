package com.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelSheet {
	DataFormatter format=new DataFormatter();
	@DataProvider(name="SanityData")
	public Object[][] getData() throws IOException{
	String url="D:\\CucumberLatest\\automation\\ExcelData.xlsx";
	FileInputStream fis=new FileInputStream(url);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Raw_Data");
	int rowCount=sheet.getPhysicalNumberOfRows();
	XSSFRow row=sheet.getRow(0);
	int colCount=row.getLastCellNum();

	Object [][] data=new Object[rowCount-1][colCount];
	for(int i=0;i<rowCount-1;i++){
		row=sheet.getRow(i+1);
		for(int j=0;j<colCount;j++){
		XSSFCell cell=row.getCell(j);
		format.formatCellValue(cell);
		data[i][j]=format.formatCellValue(cell);
	}
	workbook.close();
	}
	return data;

	}

	
	@org.testng.annotations.Test(dataProvider="SanityData")
	public void Test(String name, String comp, String emailId){
	System.out.println(name+" : "+comp+" : "+emailId);
	}

}
