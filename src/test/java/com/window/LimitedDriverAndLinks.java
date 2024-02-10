package com.window;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LimitedDriverAndLinks {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
		//ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
@Test(priority = 1)
public void allLinksCount() {
	//grab all links available in the web page
	// using tagName
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
}
@Test(priority = 2)
public void limiteDScopeTest() {
	// Limited the scope of driver and getting footer sections links only
	//if you want to limit the scope of the driver then use webelement with sigular findelement webdriver method
	WebElement footerareaLinks=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
	int size=footerareaLinks.findElements(By.tagName("a")).size();
	System.out.println(size);
	
}
@Test(priority = 3)
public void columLinkTabTest() throws InterruptedException {
	
	WebElement columnlinks=driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
	System.out.println(columnlinks.findElements(By.tagName("a")).size());
	//click for all column links are opening
	
	for(int i=1;i<columnlinks.findElements(By.tagName("a")).size();i++) {
		String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		columnlinks.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		Thread.sleep(5000);
	}
	//open all tabs 
	Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}
	
	

@AfterTest
public void tearDown() {
	driver.quit();
}
}
