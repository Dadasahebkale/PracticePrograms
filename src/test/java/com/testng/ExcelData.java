package com.testng;

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
	DataFormatter formatter=new DataFormatter();
	@Test(dataProvider = "getData")
	public void testCaseData(String Greeting,String OurLang,String Id) {
		System.out.println(Greeting+" "+OurLang+" "+Id);
		
	}
	@DataProvider
	public Object[][] getData() throws IOException{
	//	Object[][] data= {{"Hello","Welcome",123,22},{"Namaskar","RamRam",456,33},{"Bonjure","Hi",987,44}};
		FileInputStream fis=new FileInputStream("E:\\Preparation\\ExcelTest.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell=row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
		return data;
	}
	

}
