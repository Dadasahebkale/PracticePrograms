package com.links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LinksTestDemo {
	public static WebDriver driver;
	@BeforeTest
	public void lanuchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
//		ops.setExperimentalOption("excludeSwitches",
//		Arrays.asList("disable-popup-blocking"));
//		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
@Test(enabled = true)
public void NormalLinkTest() throws IOException {
	//broken link url
	//Step 1 is to get all url tied up to the links using selenium
	//java methods will call url and gets you the status code
	//if status code is greater than 400 then that url is not working
	// means link which tied to url is broken
	
	String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
	URL link = new URL(url);
	HttpURLConnection conn = (HttpURLConnection) link.openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int response=conn.getResponseCode();
	System.out.println("Working link response code "+response);
}
@Test(enabled = true)
public void brokenLinkTest() throws IOException {
	String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	URL link = new URL(url);
	HttpURLConnection conn = (HttpURLConnection) link.openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int response=conn.getResponseCode();
	System.out.println("Broken/not working link response code is "+response);
}
@Test
public void allBrokenLinkTest() throws MalformedURLException, IOException {
	SoftAssert s=new SoftAssert();
	List<WebElement> allLinks=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	//int count=allLinks.size();
	for(WebElement links :allLinks) {
		String url=links.getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode=conn.getResponseCode();
		s.assertTrue(responseCode<400, "The link with text "+links.getText()+" is broken with code "+responseCode);
//		if(responseCode>400) {
//			System.out.println("The link with text "+links.getText()+" is broken with code "+responseCode);
//			//Assert.assertTrue(false);
//		}
	}
	s.assertAll();
	
}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
