package com.window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipKartWindowHandle {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		//ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone 15 pro max ultra");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		WebElement productName=driver.findElement(By.xpath("//*[text()='Apple iPhone 15 Pro Max (Black Titanium, 256 GB)']"));
		productName.click();
		
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> itr=allWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("window.scrollBy(0,4300)");
				WebElement addtoCart=driver.findElement(By.xpath("//*[text()='Add to cart']"));
				js.executeScript("arguments[0].scrollIntoView(true);", addtoCart);
				addtoCart.click();
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
