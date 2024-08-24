package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	@Test(dataProvider = "driveTest")
	public void testCaseData(String greet,String com,int num,int i) {
		System.out.println(greet+" "+com+" "+num+" "+i);
		
	}
	@DataProvider(name="driveTest")
	public Object[][] getData() {
		Object[][] data= {{"Hello","Welcome",123,22},{"Namaskar","RamRam",456,33},{"Bonjure","Hi",987,44}};
		return data;
	}
	

}
