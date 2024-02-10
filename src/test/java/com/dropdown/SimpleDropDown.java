package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleDropDown {
	public static WebDriver driver;
	public static String url="https://www.orangehrm.com/en/30-day-free-trial";
	
	@BeforeTest
	public void launchBrower() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	@Test
	public void selectTest() {
		WebElement countryName=driver.findElement(By.id("Form_getForm_Country"));
		Select select=new Select(countryName);
//		select.selectByVisibleText("India");
		select.selectByIndex(3);
	//	select.selectByValue("Aruba");
		
		
//		By country=By.id("Form_getForm_Country");
//		doSelectByVisibleText(country, "India");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectByVisibleText(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
@AfterTest
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}
