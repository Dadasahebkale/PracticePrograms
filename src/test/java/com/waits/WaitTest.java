package com.waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		By addBox=By.cssSelector("input[id='adder']");
		WebElement e= driver.findElement(addBox);
		e.click();
	
		By box=By.cssSelector("div[id='box0']");
		myWait(driver, box);
		WebElement b=driver.findElement(box);
		b.isDisplayed();
		b.click();
		By reveal=By.cssSelector("input[id='reveal']");
		myWait(driver, reveal);
		WebElement r= driver.findElement(reveal);
		r.isDisplayed();
		r.click();
		
		Thread.sleep(1000);
		By revealed=By.cssSelector("input[id='revealed']");
		myWait(driver, revealed);
		WebElement rr= driver.findElement(revealed);
		rr.isDisplayed();
		rr.sendKeys("abc");
		rr.click();
	
		//driver.quit();
	}
	public static WebElement myWait(WebDriver driver, By by) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(d->driver.findElement(by));
		
	}
	public static WebElement fwait(WebDriver driver, By by) {
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);

		    wait.until(
		        d -> {
		        	driver.findElement(by);
		        	return true;
		        });
			return null;	
		    
		    }
	
	public static void webWait() {
		 WebElement revealed = driver.findElement(By.id("revealed"));
		    driver.findElement(By.id("reveal")).click();

		    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		    wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//input[@class='abc']")));
		    wait.until(d -> revealed.isDisplayed());
	}
}
