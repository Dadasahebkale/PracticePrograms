package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableTest {
	public static String url="https://demo.guru99.com/test/web-table-element.php";
	public static WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void validateTable() {
		System.out.println(getValidation("BEML Ltd."));
	}
	public static boolean getValidation(String companyName) {
		int rowCount=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@class='dataTable']//th")).size();
		boolean flag=false;
		for(int i=1;i<rowCount;i++) {
			for(int j=1;j<=colCount;j++) {
		//	String searchValue=driver.findElement(By.xpath("//table[@class='dataTable']/tbody//tr["+(i+1)+"]//td["+j+"]")).getText();
			String t=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();	
			if(t.equalsIgnoreCase(companyName)) {
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
	public void tearDown() {
		driver.quit();
	}
}
