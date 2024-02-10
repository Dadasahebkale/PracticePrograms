package com.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipKartElectricWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://Chromedriver//chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println("Browser has been launched");
		driver.findElement(By.name("q")).sendKeys("electric kettle");
		System.out.println("Search the product");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("Click on search button");

		driver.findElement(By.xpath("//a[text()='Butterfly Rapid Electric Kettle']")).click();
		System.out.println("Click on desired product");
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Switched on child window");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,4300)");
				System.out.println("Scroll down by using javascript executor");
				driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
				System.out.println("Click on add to cart");
				driver.switchTo().window(parentWindow);
				System.out.println("Switch back on parent window");
				driver.close();
				System.out.println("Current active : Parent window has been closed");
			}
		}

		driver.quit();
		System.out.println("All driver instances has been killed");
	}

}
