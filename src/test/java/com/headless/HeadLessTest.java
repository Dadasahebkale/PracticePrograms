package com.headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadLessTest {
	WebDriver driver;
	String url="https://www.selenium.dev/documentation/webdriver/interactions/windows/";
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.get(url);
	}
	@Test
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
