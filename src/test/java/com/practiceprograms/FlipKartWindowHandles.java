package com.practiceprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartWindowHandles {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "//c://Chromedriver//chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("iPhone 15 pro");
		WebElement submitbtn=driver.findElement(By.xpath("//*[@type='submit']"));
		submitbtn.click();
		WebElement productName=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro (Natural Titanium, 1 TB)']"));
		productName.click();
		
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> itr=allWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,4300)");
				driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
				driver.findElement(By.xpath("//*[text()='Place Order']")).click();
			}
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
