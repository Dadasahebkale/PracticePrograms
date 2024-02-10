package com.dktech;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalenderExample {
	public static WebDriver driver;
	public static String url="https://www.path2usa.com/travel/";
	//public static WebDriverWait wait;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(url);
				
	}
	public static void MyWait() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	@Test
	public void calenderTest() throws InterruptedException {
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(20));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		//w.until(ExpectedConditions(By.xpath("//input[@id='form-field-travel_from']")));
		driver.findElement(By.xpath("//input[@id='form-field-travel_from']")).sendKeys("Charlotte");
		driver.findElement(By.xpath("//input[@id='form-field-travel_to']")).sendKeys("Ahmedabad");
		//Thread.sleep(3000);		
		
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(3))
			       .ignoring(NoSuchElementException.class)
			       .ignoring(ElementClickInterceptedException.class);
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/form[@id='travel_search_form']//following-sibling::button")));
//		 WebElement foo=wait.until(new Function<WebDriver, WebElement>(){
//				 public WebElement apply(WebDriver driver) {
//					 if(driver.findElement(By.xpath("//div/form[@id='travel_search_form']//following-sibling::button")).isDisplayed()) {
//						 return driver.findElement(By.xpath("//div/form[@id='travel_search_form']//following-sibling::button"));
//						 		//span[contains(text(),'FIND COMPANION NOW')]"));
//						
//					 }else {
//						 return null;
//					 }
//			 
//		 }
//		});
		// element.click();
		
		//Thread.sleep(3000);
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'FIND COMPANION NOW')]")));
		 WebElement element=driver.findElement(By.xpath("//span[contains(text(),'FIND COMPANION NOW')]"));;
		 FluentWait<WebElement> wa=new FluentWait<WebElement>(element)
					.withTimeout(Duration.ofSeconds(40))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(TimeoutException.class).withMessage("File is not downloaded");
		 try {
			boolean isvisbile=wa.until(f->f.isDisplayed());
			if(isvisbile) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println("Time out exception");
		}	

	}
	
@AfterTest
public void tearDown() {
	driver.quit();
}
}
