package com.dktech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SelectUsingCustom {
	public static WebDriver driver;

	@Test

	public void list() {

		driver = new ChromeDriver();

		driver.get("https://www.bstackdemo.com/");

		driver.findElement(By.xpath("//select")).click();

		String option = "Highest to lowest";

		WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));

		dropdown.click();

		System.out.println("clicked");

	}

	@AfterTest

	public void tearDown() {

		driver.quit();

	}
}