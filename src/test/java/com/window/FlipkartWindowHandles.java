package com.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartWindowHandles {

	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//launch the flipkart website
		driver.get("https://www.flipkart.com");
		//search apple iphone 15
		driver.findElement(By.name("q")).sendKeys("apple iphone 15");
		//click on search button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> itr=allWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,4300)");
				driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			}
		}

	}

}
