package com.dktech;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	public static WebDriver driver;

	@Test
	public void googleTitleTest() {
		ChromeOptions ops = new ChromeOptions();
		//ops.setBrowserVersion("117");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		assertEquals(title, "Google");
	//	System.out.println(title);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Browser has been closed");
	}
}
