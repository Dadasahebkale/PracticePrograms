package com.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class FrameTest {
	WebDriver driver;
	@BeforeTest
	public void SetUp() {
	ChromeOptions ops=new ChromeOptions();
	ops.setBrowserVersion("116");
	driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/selenium/web/iframes.html");
		
	}
	@Test
	public void iFrameTest() {
		try {
			WebElement frame=driver.findElement(By.id("iframe1"));
			driver.switchTo().frame(frame);
			WebElement emailE= driver.findElement(By.id("email"));
	        emailE.sendKeys("admin@selenium.dev");
	        emailE.clear();
	        driver.switchTo().defaultContent();
			
			
		}catch(NoSuchFrameException e) {
			System.out.println(e.getMessage());
			
		}
		
		//assertEquals(true, driver.getPageSource().contains("We Leave From Here"));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
