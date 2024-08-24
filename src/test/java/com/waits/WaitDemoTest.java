package com.waits;

import java.time.Duration;

import org.openqa.selenium.By;
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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WaitDemoTest {
	public static WebDriver driver;

	@BeforeSuite
	public void LaunchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

	}

	@Test(priority = 1)
	public void fails() {
		//Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    

		By adder=By.cssSelector("input[id='adder']");
		myWait(driver, adder);
		driver.findElement(adder).click();
		//adder.click();
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='box0']")));
		By box = By.cssSelector("div[id='box0']");
		myWait(driver, box);
		WebElement ee=driver.findElement(box);
		ee.isDisplayed();
		ee.click();
	//	WebElement box =driver.findElement(By.cssSelector("div[id='box0']"));
		//wait.until(d -> box.isDisplayed());
		//box.
		

	}
	@Test(priority = 2)
	public void revealTest() {
		WebElement revelBox=driver.findElement(By.cssSelector("input[id='reveal']"));
		revelBox.isDisplayed();
		revelBox.click();
		System.out.println("User clicked on revelBox");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	public static void myWaifft(WebElement element, int time) {
//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofMillis(500))
//				.ignoring(NoSuchElementException.class);
//
//		wait.until(d->{
//			element.click();
//			return true;
//		});
		FluentWait<WebDriver> w=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
			w.until(ExpectedConditions.visibilityOf(element));
			//element.click();
	}

	public static WebElement myWait(WebDriver driver, By by) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(d->driver.findElement(by));
	}

}
