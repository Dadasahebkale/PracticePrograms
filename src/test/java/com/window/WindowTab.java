package com.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowTab {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
	}
	@Test
	public void windowTest() {
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com");
		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys(courseName);
		
	}
	
}
