package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
	@org.testng.annotations.Test
	public void geturl() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.google.com");
		
	}

}
