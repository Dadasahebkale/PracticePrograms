package com.dktech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LimitScopeOfDriver {

	public static void main(String[] args) {
	WebDriver driver;
	ChromeOptions ops=new ChromeOptions();
	ops.setBrowserVersion("117");
	driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	
	WebElement footerarea=driver.findElement(By.cssSelector("footer.nI-gNb-footer"));
	System.out.println(footerarea.findElements(By.tagName("a")).size());
	
	driver.quit();
	}

}
