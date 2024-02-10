package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.driver.chrome", "c://Chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	}
	@Test
	public boolean tableTest() {
		//name="italy";
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		boolean flag=false;
		for(int i=1;i<rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
				String actualValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if(actualValue.equals("Italy")) {
					flag=true;
					System.out.println(i+" : "+j);
					break;
				}
			}
		}
		if(flag) {
			return true;
		}
		return false;
	}

}
