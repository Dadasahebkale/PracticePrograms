package com.dktech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDynamicTable {
	public static WebDriver driver;
	public static ChromeOptions ops;
	@BeforeTest
	public static void setUp() {
		//System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
		ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void getFbTitle() {
		//setUp();
		driver.get("https://www.fb.com");
		String title=driver.getTitle();
		System.out.println(title);
		
	}	
	@Test(priority = 2)
	public void getCurrentUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
