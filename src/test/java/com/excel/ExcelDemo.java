package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo {
	@Test
    public void getData(){
        String url="E:\\QAHUB\\DkAutomation\\TestData.xlsx";
        FileInputStream fis= null;
        try {
            fis = new FileInputStream(url);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int sheets=workbook.getNumberOfSheets();
        for(int i=0;i<sheets;i++){
          //  System.out.println(i);
            if(workbook.getSheetName(i).equalsIgnoreCase("Sample")){
                XSSFSheet sheet=workbook.getSheetAt(i);
                Iterator<Row> rowIterator=sheet.iterator();
                Row firtRow=rowIterator.next();
                Iterator<Cell> cellIterator=firtRow.cellIterator();
                int k=0, column=0;
                while (cellIterator.hasNext()){
                    Cell value=cellIterator.next();
                    if(value.getStringCellValue().equalsIgnoreCase("TestCases")){
                        column=k;
                    }
                    k++;
                }
                System.out.println(column);
            }
            
        }
        try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	

}
