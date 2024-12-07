package com.brokenlinks;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrokenLinks {
public static WebDriver driver;
public static String u="https://www.amazon.in/";
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(u);

	}
	@Test
	public void brokeLinkTest() {
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links "+allLinks.size());
		List<String> urlLinks=new ArrayList<String>();
		
		for(WebElement e :allLinks) {
			String url=e.getAttribute("href");
			urlLinks.add(url);
			//verifyLikns(url);
		}
		long startTime=System.currentTimeMillis();
		urlLinks.parallelStream().forEach(e->verifyLikns(e));
		long EndTime=System.currentTimeMillis();
		System.out.println("Totla time "+(EndTime-startTime));
	}
	public static void verifyLikns(String urlLinks) {
		try {
			URI uri = new URI(urlLinks);
			URL url = uri.toURL();
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(urlLinks+"-->"+huc.getResponseMessage()+" is broken link");
			}else {
				System.out.println(urlLinks+"-->"+huc.getResponseMessage());
			}
		} catch (Exception e) {
			System.out.println("Exceptin is "+e.getMessage());
		}
	}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
