package com.pagination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Paginations {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.cssSelector("a[class='_1LKTO3'] span"));
		//Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,3000)", element);
		System.out.println("Clicked on next button");
		//js.executeScript("arguments[0].scrollIntoView();", element);
		//js.executeScript("arguments[0].scrollIntoView();", element);
		
		element.isDisplayed();
		element.click();
		driver.quit();
	}
	
}
