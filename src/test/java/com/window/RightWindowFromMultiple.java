package com.window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class RightWindowFromMultiple {
public static String url="https://opensource-demo.orangehrmlive.com/";
public static WebDriver driver;

//@BeforeTest
public static void main(String args[]) {
	ChromeOptions ops=new ChromeOptions();
	ops.setBrowserVersion("118");
	driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
	driver.findElement(By.xpath("https://www.facebook.com/OrangeHRM/")).click();
	driver.findElement(By.xpath("https://www.twitter.com/OrangeHRM/")).click();
	driver.findElement(By.xpath("https://www.youtube.com/OrangeHRM/")).click();
	
	Set<String> handles=driver.getWindowHandles();
	List<String> hList=new ArrayList<String>(handles);
	if(switchToRightWindow("Facebook", hList)) {
		System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
	}
	
}
public static boolean switchToRightWindow(String windowTitle, List<String> uList) {
	for(String e : uList) {
		String title=driver.switchTo().window(e).getTitle();
		if(title.contains(windowTitle)) {
			System.out.println("Found the right window......");
			return true;
		}
	}
	return false;
}
}
