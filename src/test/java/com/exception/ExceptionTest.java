package com.exception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test
	public void clickTest() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Java script executor methods list for pefrom action while testing");
		WebElement btn=driver.findElement(By.cssSelector("div.FPdoLc.lJ9FBc center input[value='Google Search']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", btn);
		
	}

}
