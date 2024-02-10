package com.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser(){

	System.setProperty("webdriver.driver.chrome","C://Chromedriver//chromedriver.exe");

	driver=new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");

	}
	@Test
	public void WindTest(){

	driver.findElement(By.name("q")).sendKeys("Apple 15 pro max");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (White Titanium, 256 GB)']")).click();

	String parentWindow=driver.getWindowHandle();

	Set<String> allWindows=driver.getWindowHandles();

	Iterator<String> itr=allWindows.iterator();

	while(itr.hasNext()){
		String childWindow=itr.next();

		if(!parentWindow.equalsIgnoreCase(childWindow)) {
			driver.switchTo().window(childWindow);

			JavascriptExecutor js=(JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,4200)");

			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

		}
		}

	}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
