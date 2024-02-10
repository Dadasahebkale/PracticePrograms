package com.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class WaitDemo {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "//c://Chromedriver//chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dynamic-properties");
		
	}
	@Test
	public void waitTest() {
		System.out.println(driver.findElement(By.id("enableAfter")).getText());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		WebElement visibletext=driver.findElement(By.id("visibleAfter"));
		myWait(visibletext, 20);
		//visibletext.click();
		//timeS(visibletext);
		visibletext.click();
		System.out.println("Clicked on button");
	}
@AfterTest
public void tearDown() {
	driver.quit();
}
public static void myWait(WebElement element,int time) {
	
	FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	
}
public static void timeS(WebElement foo) {
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
			.withTimeout(Duration.ofSeconds(30))
			 .pollingEvery(Duration.ofSeconds(5))   
			 .ignoring(NoSuchElementException.class);
			 foo = wait.until(new Function<WebDriver,WebElement>() {  

			      public WebElement apply(WebDriver driver) {    
			 return driver.findElement(By.id("foo"));    
			    }
			 });
}
}
