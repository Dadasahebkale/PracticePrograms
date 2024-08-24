package com.selectorhub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectorHub {
	public WebDriver driver=null;
	By companyName=By.cssSelector("div.element-companyId input[name='company']");
	By phoneNumber=By.cssSelector("div.element-companyId input[name='mobile number']");
	By email=By.xpath("//input[@id='pass']//preceding::input[@id='shub23']");
	By pass=By.xpath("//input[@id='shub91']//following::input[@id='pass']");
	By button=By.cssSelector("button[value='Submit']");
	
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void FormTest() {
		driver.switchTo().frame(0);
		driver.findElement(email).sendKeys("dadasahebkale.dk@gmail.com");
		driver.findElement(pass).sendKeys("Welcome@01");
		driver.findElement(companyName).sendKeys("Coforge");
		driver.findElement(phoneNumber).sendKeys("798787798");
		driver.findElement(button).click();
	}

}
