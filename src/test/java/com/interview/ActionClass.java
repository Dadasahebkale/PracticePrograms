package com.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		
	}
	@Test
	public void dragAndDropOver() {
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		// using click and hold method
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		action.dragAndDrop(source, target).release().build().perform();
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void mouseOver() {
		driver.get("https://www.ebay.com");
		WebElement electronics=driver.findElement(By.xpath("//li/a[text()='Electronics']"));
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
		WebElement audio=driver.findElement(By.xpath("//li/a[text()='Portable audio and headphones']"));
		audio.click();
	}

}
