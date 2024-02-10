package com.dktech;

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

public class DataTable {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
	}
	@Test
	public void getDataTable() {
		List<WebElement> allHeaders=driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		int headerCount=allHeaders.size();
		for(WebElement headers :allHeaders) {
			//String header=driver.findElement(By.xpath("//table[@class='dataTable']//th")).getText();
			System.out.print((headers.getText()+"|")+" \t"+"\t");
		}
	}
	@Test
	public void getTabledata() {
		List<WebElement> alltableheader=driver.findElements(By.xpath("//table[@class='dataTable']//tr//td//a"));
		List<WebElement> tabledata=driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		System.out.println(" ");
		int t1=alltableheader.size();
		int t2=tabledata.size();
		for(int i=1;i<t1;i++) {
			for(int j=1;j<=t2;j++) {
				String text=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+(i+1)+"]//td["+j+"]")).getText();
				System.out.print(text+" | ");
			}
			System.out.println(" ");
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
