package com.scroll;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollWindowAndTable {
	public static WebDriver driver;
	@BeforeTest
	public void lanuchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
		//ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
@Test(priority = 1)
public void WindowScrollTest() {
	// need to use javascriptExecutor and cast with driver
		//open the console
		//type window.scrollBy=> desire location=> we can check our location area
		//copy the same and paste into executeScript method
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	System.out.println("Scrollby 500");
}
@Test(priority = 2)
public void ScrollTable() {
	// capture the class name for the cssSelector
	//open the console
	//type document.querySelector
	//paste class name in double inverted commas
	//then type .scrollTop and give your require value
	//same need to paste in method executeScript method along with single quotation
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
	System.out.println("Scroll by table using query selecton along with cssSelector");
	List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	int sum=0;
	for(int i=0;i<values.size();i++) {
	sum=sum+Integer.parseInt(values.get(i).getText());
	}
	System.out.println(sum);
	driver.findElement(By.cssSelector(".totalAmount")).getText();
	int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	Assert.assertEquals(sum, total);
	// sum the total column value
	// string convert into integer value using parseInt method
	// print the sum of value out of the loop
	
	//total amount fetch from web using cssSelector
	//using debug mode split the total amount from the string
	// second array we grab
	// delete the space using trim method
	//grab the string and convert string into integer using parseInt method
	// use assert equals method to validate web total and our total
}
@Test(priority = 3)
public void TotalAmountTest() {
	List<WebElement> values=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
	int sum=0;
	for(int i=0;i<values.size();i++) {
		sum=sum+Integer.parseInt(values.get(i).getText());
	}
	System.out.println(sum);
	Assert.assertEquals(235, sum);
//	driver.findElement(By.cssSelector(".totalAmount")).getText();
//	int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//	Assert.assertEquals(296, total);
//	//System.out.println(total);
	
}
@AfterTest
public void teadDown() {
	driver.quit();
}
}
