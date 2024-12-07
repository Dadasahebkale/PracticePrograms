package com.window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZohoWindows {
	public static WebDriver driver;
	public static void main(String[] args) {
		String url="https://www.zoho.com/";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		ops.addArguments("--incognito");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		String parentWindowId=driver.getWindowHandle();
//		List<WebElement> list=driver.findElements(By.xpath("//div[@class='zsocial-share']/a"));
//		for(int i=0;i<list.size();i++) {
//			list.get(i).click();
//		}
		driver.findElement(By.xpath("//div[@class='zsocial-share']/a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//div[@class='zsocial-share']/a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//div[@class='zsocial-share']/a[text()='Youtube']")).click();
		driver.findElement(By.xpath("//div[@class='zsocial-share']/a[text()='linkedin']")).click();
		driver.findElement(By.xpath("//div[@class='zsocial-share']/a[text()='Instagram']")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String>hlist=new ArrayList<String>(handles);
		if(switchToRightWindow("LinkedIn",hlist)) {
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
		}
		closeAllWindows(hlist, parentWindowId);
		switchToParentWindow(parentWindowId);
		System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
		driver.quit();
	}
	public static boolean switchToRightWindow(String windowTitle, List<String> hlist) {
		for(String e : hlist) {
			String title=driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("Found the right title...");
				return true;
			}
		}
		return false;
	}
	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}
	public static void closeAllWindows(List<String> hlist, String parentWindowId) {
		for(String e : hlist) {
			if(!e.equals(parentWindowId)) {
				driver.switchTo().window(e);
			}
		}
	}

}
