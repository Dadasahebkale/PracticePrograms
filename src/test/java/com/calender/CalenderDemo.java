package com.calender;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalenderDemo {
public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
	}
@Test(priority = 1)
public void selectCalenderDate() throws InterruptedException {
	Thread.sleep(2000);
	WebElement date=driver.findElement(By.id("form-field-travel_comp_date"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",date);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
	while(!driver.findElement(By.cssSelector("span[title='Scroll to increment']")).getText().contains("May")){
	
		driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		Thread.sleep(1000);
	}
	Thread.sleep(2000);
	int count=driver.findElements(By.className("flatpickr-day")).size();
	for(int i=0;i<count;i++) {
		String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
		if(text.equalsIgnoreCase("23")) {
			driver.findElements(By.className("flatpickr-day")).get(i).click();
			System.out.println("Selected date is "+text);
			break;
		}
		
	} 
	
}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
