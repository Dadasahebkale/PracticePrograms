package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableTestDemo {
	public static WebDriver driver;
	
	@BeforeTest
	public void getBrowserLaunch() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	@Test
	public  void nameValidationTableTest() {
		System.out.println(getName("Germany"));
		System.out.println(getName("Giovanni Rovelli"));
		System.out.println(getName("Canada"));
		System.out.println(getName("Island Trading"));
		
	}
	public static boolean getName(String name) {
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		boolean flag=false;
		for(int i=1;i<rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				String actValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if(actValue.contains(name)) {
					flag=true;
					System.out.println(i+" : "+j);
					break;
				}
			}
		}
		if(flag) {
			return true;
		}
		return flag;
	}
	@AfterTest
	public static void tearDown() {
		driver.quit();
	}
}
