package com.flipkart;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchIphone {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchFlipKart() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void searchProduct() throws InterruptedException {
		WebElement searchProduct=driver.findElement(By.cssSelector("input[name='q']"));
		sendKeysOnWebElement(searchProduct, "iphone 15");
		//searchProduct.sendKeys("iphone 15");
		WebElement searchButton=driver.findElement(By.cssSelector("button[type='submit']"));
		//searchButton.click();
		clickOn(searchButton);
		WebElement iphone= driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']"));
		clickOn(iphone);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);

	
		WebElement addCart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
		//addCart.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)",addCart);
		
		clickOn(addCart);
		//addCart.click();
	
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	public static void clickOn(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ele=null;
		ele=wait.until(ExpectedConditions.elementToBeClickable(element));
		ele.click();
	}
	public static void sendKeysOnWebElement(WebElement element,String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	public static void selectByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
}
