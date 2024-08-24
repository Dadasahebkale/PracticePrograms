package com.testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Amazon {
	public static WebDriver driver=null;
	@BeforeSuite
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Driver instance has been closed");
	}
	@Test
	public void getAmazonTest() {
		List<WebElement>links=driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
			//	+ "//*[text()='Fresh']/parent::a/parent::div/child::*"));
		for(WebElement s: links) {
			System.out.println(s.getText());
		}
	}

}
