package com.practiceprograms;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlesTest {

	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("iPhone 15 pro");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		WebElement productName=driver.findElement(By.xpath("//*[text()='Apple iPhone 15 Pro (Black Titanium, 256 GB)']"));
		productName.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window id "+parentWindow);
		Set<String> allwindow=driver.getWindowHandles();
		Iterator<String> itr=allwindow.iterator();
		while(itr.hasNext()) {
			String childWindows=itr.next();
			if(!parentWindow.equalsIgnoreCase(childWindows)) {
				driver.switchTo().window(childWindows);
				System.out.println("Child window id is "+childWindows);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,4400)");
				driver.findElement(By.xpath("//*[text()='Add to cart']"));
				driver.switchTo().window(parentWindow);
				System.out.println("Parent window id is "+parentWindow);
			}
		}
		driver.quit();
	}

}
