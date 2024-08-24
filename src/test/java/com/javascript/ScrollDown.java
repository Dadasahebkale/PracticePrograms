package com.javascript;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Iphone 15 pro");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Apple iPhone 15 Pro Max (White Titanium, 256 GB)']")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> itr=allWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				Thread.sleep(3000);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("scroll(0,4400)");
				
			WebElement addtoCart=driver.findElement(By.xpath("//*[text()='Add to cart']"));
				//js.executeScript("arguments[0].click();", addtoCart);
			System.out.println("User clicked on the Add to cart button");
				Thread.sleep(3000);
			addtoCart.click();
			}
		}
				
		Thread.sleep(8000);

		driver.quit();
	}

}
