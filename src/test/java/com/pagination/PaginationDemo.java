package com.pagination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaginationDemo {
	public WebDriver driver=null;
	
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void paginationTest() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		List<WebElement> tableContains=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
		List<String> names=new ArrayList<String>();
		for (WebElement tableEle : tableContains) {
			names.add(tableEle.getText());
		}
		String nextbtn=driver.findElement(By.xpath("//button[@type='button']")).getAttribute("class");
		while(!nextbtn.contains("disabled")) {
			driver.findElement(By.xpath("//button[@type='button']")).click();
			tableContains=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
			for (WebElement tableEle : tableContains) {
				names.add(tableEle.getText());
				
			}
			nextbtn=driver.findElement(By.xpath("//button[@type='button']")).getAttribute("class");
		}
		for (String name : names) {
			System.out.println(name);
			
		}
		int totalNames=names.size();
		System.out.println("Total number of names "+totalNames);
		String displayedCount=driver.findElement(By.xpath("//div[@id='example_info']")).getText().split(" ")[5];
		System.out.println("Total number of displayed names count "+displayedCount);
		//Assert.assertEquals(displayedCount, String.valueOf(totalNames));
		Thread.sleep(5000);
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	

}
