package com.pagination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.stream.Stream;

public class Google {
	public static WebDriver driver;
	@BeforeTest
	public void lanuchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("--headless");
//		ops.setExperimentalOption("excludeSwitches",
//		Arrays.asList("disable-popup-blocking"));
	ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
	}
@Test(enabled = true)
public void GoogleTest() {
	String title=driver.getTitle();
	if(title.contains("Google")) {
		System.out.println("Pass : Title is google");
	}else {
		System.out.println("Fail : Title is not google : Actual title is "+title);
	}
	driver.get("https://www.google.co.in");
	String url=driver.getCurrentUrl();
	if(url.contains("google.co.in")) {
		System.out.println("Pass : URL has co.in");
	}else {
		System.out.println("Fail : URL don't have c0.in "+url);
	}
	
}
@AfterTest
public void tearDown() {
	driver.quit();
}

}
