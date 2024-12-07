package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClassDemo {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Actions a=new Actions(driver);
	}
	@Test(priority = 2,invocationCount = 6)
	public void capitalLetterTest() throws InterruptedException {
		Actions a=new Actions(driver);
		WebElement search=driver.findElement(By.name("q"));
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("ganesh").sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("DADA").sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Pranav").sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Oviya").sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Welcome").sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("welcome").sendKeys(Keys.ENTER).build().perform();
		
		WebElement move=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
//				//+ "//div/ul[@class='_3YjYK7 ecs1XG']"));
		a.moveToElement(move).contextClick().build().perform();
		
	}
	@Test(priority = 1)
	public void actionTest() throws InterruptedException {
		Actions a=new Actions(driver);
		Thread.sleep(2000);
	
		WebElement move=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		a.moveToElement(move).contextClick().build().perform();
		Thread.sleep(2000);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
