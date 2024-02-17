package com.pdfread;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class PDFReading {
	
	WebDriver driver;
	String url="";
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		ops.addArguments("headless=new");
		
		driver=new ChromeDriver(ops);
		
	}

}
