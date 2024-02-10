package com.pagination;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilterDemo {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	}
	@Test
	public void filterTest() {
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
	List<WebElement> filterList= veggies.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filterList.size());
	}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
