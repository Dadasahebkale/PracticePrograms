package com.sslcertification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SSLCertificateDemo {
	public WebDriver driver;
	@Test
	public void SSLCerticateTest() {
		ChromeOptions ops=new ChromeOptions();
		ops.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(ops);
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
	}
@AfterTest
public void tearDown() {
driver.quit();	
}
}
