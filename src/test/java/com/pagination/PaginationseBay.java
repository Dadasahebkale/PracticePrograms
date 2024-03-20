package com.pagination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PaginationseBay {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		//Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement search= driver.findElement(By.xpath("//input[@name='_nkw']"));
		search.sendKeys("Sarees for Women");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		WebElement element= driver.findElement(By.xpath("//a[@type='next']"));
		js.executeScript("window.scrollBy(0,3000)", element);
		element.isDisplayed();
		element.click();
		System.out.println("Clicked on next page");
		driver.quit();
		
	}

}
