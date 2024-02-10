package com.calender;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeMyTrip {
	public static WebDriver driver;
	@BeforeTest
	public void lanuchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
	}
	@Test
	public void calnder() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn")).click();;
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",date);
		//date.click();
		//Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[@class='bgProperties  overlayCrossIcon icon20']")).click();
		Thread.sleep(14000);
		driver.findElement(By.cssSelector("#departure")).click();
		while(!driver.findElement(By.xpath("#departure")).getText().contains("May 2024")){
			
			driver.findElement(By.cssSelector(".datePickerContainer")).click();
					//"span[aria-label='Next Month']")).click();
				//div[class='datePickerContainer'] [class='DayPicker-Day']
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		int count=driver.findElements(By.className("DayPicker-Day")).size();
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(text.equalsIgnoreCase("2")) {
				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				System.out.println("Selected date is "+text);
				break;
			}
			
		} 
	}
@AfterTest
public void tearDown() {
	//driver.quit();
}

}
