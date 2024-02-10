package com.dktech;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {

	public static WebDriver driver;
	@BeforeTest
	public void SetUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void HeaderInTableTest(){
		
		
		List<WebElement> allheaders=driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		
		System.out.println(allheaders.size());
		Assert.assertEquals(allheaders.size(), 5,"Header count is not matching");
		
		boolean status=false;
		
		for(WebElement ele : allheaders) {
			String headervalues=ele.getText();
			System.out.println(headervalues);
			if(headervalues.contains("Action")) {
				status=true;
				 	break;
			}
		}
		Assert.assertTrue(status,"Header is not present");
	}
	@Test(priority = 2)
	public void AllTableRowsTest() {
		System.out.println("======================================================");
		List<WebElement> numberOfRows=driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
		System.out.println("Number of rows is "+numberOfRows.size());
		Assert.assertEquals(numberOfRows.size(), 7,"Table rows does not matching");
		for(WebElement e : numberOfRows) {
			String rowsvalue=e.getText();
			System.out.println(rowsvalue);
		}
	}
	@Test(priority=3)
	public void AllTableData() {
		System.out.println("===================================================");
		List<WebElement> allData=driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		boolean TableDataStatus=false;
		
		int tableData=allData.size();
		System.out.println("Total data is "+tableData);
		for(WebElement e :allData ) {
			String value=e.getText();
			System.out.println(value);
			if(value.contains("Ola")) {
				TableDataStatus=true;
				break;
			}
		}
		Assert.assertTrue(TableDataStatus, "Data not present on the table");
	}
	@Test(priority=4)
	public void CompanyTest() {
	List<WebElement> CompanyNames=driver.findElements(By.xpath("//table[contains(@id,'cust')]//td[2]"));
	int NumberOfCompany=CompanyNames.size();
	System.out.println("Number of company are : "+NumberOfCompany);
	
	boolean CompanyStatus=false;
	
	for(WebElement comp : CompanyNames) {
		String value=comp.getText();
		System.out.println(value);
		if(value.contains("Java")) {
			CompanyStatus=true;
			break;
		}
		
	}
	Assert.assertTrue(CompanyStatus, "Company name not match");
	}
	@Test(priority = 6)
	public void checkBoxTest() throws InterruptedException {
		Thread.sleep(5000);
		WebElement SeleniumCheckBox=driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input"));
		SeleniumCheckBox.click();
		WebElement clickMore=driver.findElement(By.xpath("//td[text()='Selenium']//following-sibling::td[3]/a"));
		clickMore.click();
		//driver.navigate().back();
		
	}
	@Test(priority=7)
	public void clickTest() {
		WebElement clickMore=driver.findElement(By.xpath("//td[text()='Selenium']//following-sibling::td[3]/a"));
		clickMore.click();
	}
	@Test(priority=5)
	public void AllCheckBoxTest() throws AWTException, InterruptedException {
		List<WebElement> allcheckboxes=driver.findElements(By.xpath("//td//input"));
		List<WebElement> moreOptions=driver.findElements(By.xpath("//td//input//following::td[4]"));
		
		for(int i=0;i<=allcheckboxes.size();i++) {
			
		}
		
		int checkbox=allcheckboxes.size();
		System.out.println("All checkboxes are "+checkbox);
		Actions act=new Actions(driver);
		for(WebElement check :allcheckboxes ) {
			
			act.keyDown(Keys.CONTROL).moveToElement(check).click().perform();
			
				
			}
		for(WebElement m :moreOptions) {
			act.keyDown(Keys.CONTROL).moveToElement(m).click().perform();
			
			}

		Thread.sleep(2000);
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Browser has been closed");
	}
}
