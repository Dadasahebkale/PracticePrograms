package com.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandles {
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	}

	@Test
	public void newTab() {
		// open new child window within main window
		driver.findElement(By.id("tabButton")).click();
		// get handles of window
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		// Here we will check if child window has other child windows and will fetch the
		// heading of the child window
		while (itr.hasNext()) {
			String childWinow = itr.next();
			if (!mainWindow.equalsIgnoreCase(childWinow)) {
				driver.switchTo().window(childWinow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Child window text ==>"+text.getText());

			}
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
