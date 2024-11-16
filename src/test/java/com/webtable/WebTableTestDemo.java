package com.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableTestDemo {
	static WebDriver driver;
	@BeforeTest
	public void Setup() {
		String url="https://cosmocode.io/automation-practice-webtable/";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	@Test(priority=1)
	public void getColRowCount() {
		int rowCount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println(rowCount);
		int colCount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println(colCount);
	}
	@Test(priority=2)
	public void CellValueTest() {
		getCellValue(4,4);
		getCellValue(5,3);
		
	}
	public static void getCellValue(int rowNumber, int colNumber) {
	String cellValue=driver.findElement(By.xpath("//table[@id='countries']//tr["+rowNumber+"]//td["+colNumber+"]")).getText();
	System.out.println(cellValue);
		
	}
	public static void checkBoxt(int rowNumber) {
		driver.findElement(By.xpath("//table[@id='countries']//tr["+rowNumber+"]//td[1]//input")).click();
	}
	@Test(priority=3)
	public void CheckBoxTest() {
		checkBoxt(5);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
