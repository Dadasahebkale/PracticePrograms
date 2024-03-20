package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptTest {
public static WebDriver driver;
public static String url;
	@BeforeTest
	public void launchBrower() {
		url="https://www.amazon.in/";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test
	public void getSearchTest() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("document.getElementById('twotabsearchtextbox').value='mobile';");
		js.executeScript("document.querySelector('#nav-search-submit-button').click();");
		//js.executeScript("document.getElementsByName('q').value='rbc@xyz.com';");

	}
	//@Test
	public void Browerstack() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.browserstack.com/users/sign_in");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('enter correct login credentials to continue');");
		sleep(2000);
		}

		public static void sleep(int ms)
		{
		try

		{
			Thread.sleep(ms); 
		}
		catch(InterruptedException e)

		{
		e.printStackTrace();
		}
	}
	//@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
