package com.javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptDemo {
	public static WebDriver driver;
	@BeforeTest
	public void lanuchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void login() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('user_password').value='password';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('user_submit').click();");
		Thread.sleep(2000);
		js.executeScript("alert('enter correct login credentials to continue');");
		Thread.sleep(2000);
		
	}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
