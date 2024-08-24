package com.webtable;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableTestMukesh {
	public static String url="https://seleniumpractise.blogspot.com";
	public static WebDriver driver;
	@BeforeTest
	public void getBrowserLaunch() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
}
	@Test(priority=1)
	public static void tableHeaderTest(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>+");
		List<WebElement> allHeaders=driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(allHeaders.size());
		Assert.assertEquals(allHeaders.size(), 5,"Cloumn Count is not same");
		for(int i=0;i<allHeaders.size();i++) {
			System.out.println(allHeaders.get(i).getText());
		}
	}
	@AfterTest
	public static void tearDown() {
		driver.quit();
	}
	@Test(priority=2)
	public void CountryValidationTest(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>+");
		List<WebElement> allHead=driver.findElements(By.xpath("//table[@id='customers']//th"));
		boolean status=false;
		for(WebElement e : allHead) {
			
			String text=e.getText();
			System.out.println(text);
			if(text.contains("Country")) {
				status=true;
				break;
			}
		}
		Assert.assertTrue(status,"Header is not present");
	}
	@Test(priority=3)
	public void specificNameTest(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>+");
		List<WebElement> cityName=driver.findElements(By.xpath("//table[@id='customers']//td[4]"));
		boolean status=false;
		for(WebElement e : cityName) {
			String value=e.getText();
			System.out.println(value);
			if(value.contains("Bangalore")) {
				status=true;
			}
		}
		Assert.assertTrue(status,"Bangalore city name not available on the table");
	}
	@Test(priority = 4)
	public void verifyCompanyName(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>+");
		List<WebElement> companyName=driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
		boolean status=false;
		for(WebElement e : companyName) {
			String value=e.getText();
			System.out.println(value);
			if(value.contains("Java")) {
				status=true;
			}
		}
		Assert.assertTrue(status,"Specified company name not available");
	}
	@Test(priority =5)
	public void clickOnBeforeCheckBox(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>+");
		WebElement checkBox=driver.findElement(By.xpath("//*[text()='Selenium']//preceding-sibling::td//input"));
		boolean checkBoxstatus=false;
		checkBox.click();
		if(checkBox.isSelected()) {
			checkBoxstatus=true;
		}
		Assert.assertTrue(checkBoxstatus,"Check box is not checked");
	}
	@Test(priority=6,enabled = false)
	public void clickedOnAmazonLink(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>");
		WebElement linkClicked=driver.findElement(By.xpath("//td[text()='Amazon']//following-sibling::td[3]//a"));
		boolean linkStatus=false;
		linkClicked.click();
		
			linkStatus=true;
		
		Assert.assertTrue(linkStatus,"Not clicked on amazon link");
	}
	@Test(priority=7)
	public void clickOnOla(Method method) {
		System.out.println("This is the test name of "+method.getName()+" =======================>");
		WebElement olaLink=driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a"));
		boolean olaLinkstaus=false;
		olaLink.click();
		olaLinkstaus=true;
		Assert.assertTrue(olaLinkstaus," Link not available");
	}
}
