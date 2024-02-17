package com.window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bymatautomation.com");
		String parentWindow=driver.getWindowHandle();
		
		List<WebElement> links=driver.findElements(By.cssSelector("div[class='social-icon-container d-inline-flex']"));
		for(int i=0;i<links.size();i++) {
		links.get(i).click();
		
		}
		Set<String> allWindows=driver.getWindowHandles();
		List<String> hList=new ArrayList<String>(allWindows);
		if(switchToRightWindow("LinkedIn", hList)) {
			System.out.println(driver.getCurrentUrl() +" : "+driver.getTitle());
		}
		closeAllWindow(hList, parentWindow);
		swithToParentWindow(parentWindow);
		System.out.println(driver.getCurrentUrl() +" : "+driver.getTitle());
		driver.quit();
	}
	public static void closeAllWindow(List<String> hList, String parentWindow) {
		for(String e : hList) {
			if(!e.equals(parentWindow)) {
				driver.switchTo().window(e).close();
			}
		}
	}
	public static void swithToParentWindow(String parentWindow) {
		driver.switchTo().window(parentWindow);
	}
	public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		for(String e : hList) {
			String title=driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("Found the right window...");
				return true;
			}
		}
		return false;
		
	}
}
