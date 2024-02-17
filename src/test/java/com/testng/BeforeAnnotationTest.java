package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAnnotationTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchGoogle() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.get("https://google.com");
	}
	@BeforeTest
	public void launchAmazone() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.get("https://www.amazon.in");
	}
	@Test
	public void TitleTest() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
