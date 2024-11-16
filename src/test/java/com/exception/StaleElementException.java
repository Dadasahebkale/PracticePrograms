package com.exception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaleElementException {
static WebDriver driver;
	public static void main(String args[]) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("116");
		driver=new ChromeDriver(ops);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("a[title='Login'] span")).click();;
	System.out.println("User Clicked on the details");
	driver.findElement(By.xpath("Enter Email/Mobile number")).sendKeys("121312345");
	driver.findElement(By.name("login")).click();
	//WebElement searchButton=driver.findElement(By.cssSelector("button[type='submit']"));
	//searchButton.click();
//	clickOn(searchButton);
	//System.out.println("User clicked on the button");
	}
	public static void clickOn(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele=null;
		ele=wait.until(ExpectedConditions.elementToBeClickable(element));
		ele.click();
	}
	
}
/*Velocity is matric that is calculated by the addition of all efforts estimates associated with user-stories completed
 * in an iteration. it predicts how much work agile can completed in a sprint and how much time will it require to 
 * */
 