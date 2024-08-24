package com.testng;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo {
	static WebDriver driver=null;
	@BeforeSuite
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Set up all things.....");
	}
	@BeforeClass
	public void launchBrowser() {
		
		System.out.println("Launch the browser....");
	}
	@BeforeMethod
	public void getUrl() {
		
		System.out.println("URL has been launched");
	}
	@BeforeTest
	public void logInApp() {
		driver.get("https://www.google.com");
		System.out.println("Log in the app");
	}
	@Test()
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	@Test
	public void gmailLinkTest() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test
	public void ImagesLinkTest() {
		boolean b=driver.findElement(By.linkText("Images")).isDisplayed();
	}
	@Test
	public void GoogleAppsLinkTest() {
		boolean b=driver.findElement(By.xpath("//a[@class='gb_d']")).isDisplayed();
	}
	@Test
	public void googleSearchLinkTest() {
		boolean b=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).isDisplayed();
	}
	@org.testng.annotations.Test
	public void googleTitleTest() {
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void logOutApp() {
		System.out.println("Log out from the App");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser has been closed");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("All browser has been closed");
	}


}
