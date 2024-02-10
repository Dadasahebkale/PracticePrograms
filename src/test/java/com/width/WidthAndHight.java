package com.width;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WidthAndHight {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	}

	@Test
	public void WidhtAndHightTest() {
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		System.out.println(nameEditBox.getRect().getDimension().getHeight());
		System.out.println(nameEditBox.getRect().getDimension().getWidth());
}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}