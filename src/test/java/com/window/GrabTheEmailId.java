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

public class GrabTheEmailId {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}
	@Test(priority = 1)
	public void WindowHandleTest() {
		WebElement blinkLink=driver.findElement(By.cssSelector("body a[class='blinkingText']"));
		blinkLink.click();
		Set<String> Window=driver.getWindowHandles();
		System.out.println("Windiow id is="+Window);
		Iterator<String> it=Window.iterator();
		String parentId=it.next();
		String childId=it.next();
		//for(int i=0;i<=it.next();i++)
		driver.switchTo().window(childId);
		//String text=driver.findElement(By.xpath("//p/strong/a")).getText();
		String t=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String text=driver.findElement(By.xpath("//p/strong/a")).getText();
		System.out.println(text);
		String emailid=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		WebElement emailadd=driver.findElement(By.cssSelector("input[id='username']"));
		emailadd.sendKeys(emailid);
		System.out.println(t);
		System.out.println(emailid);
	}
	@Test
	public void SwitchWindow() {
	Set<String> parentWindow=driver.getWindowHandles();
	System.out.println("Windiow id is="+parentWindow);
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Browser has been closed");
	}
}
