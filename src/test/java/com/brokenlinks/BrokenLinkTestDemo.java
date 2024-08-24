package com.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrokenLinkTestDemo {
	public static WebDriver driver;
	
	@BeforeSuite
	public void LaunchBrower() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fb.com");
	}
	@Test
	public void getBrokenLinkTest() {
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		List<String> urlLinks=new ArrayList<String>();
		//Iterator<String> itr=urlLinks.iterator();
		for(WebElement element : allLinks) {
			String url=element.getAttribute("href");
			urlLinks.add(url);
			urlLinks.parallelStream().forEach(s->verifyLinks(s));
			
		}
		
	}
	public static void verifyLinks(String urllinks){
		try {
			URL url=new URI(urllinks).toURL();
			HttpURLConnection huc=(HttpURLConnection) url.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(urllinks+"--->"+huc.getResponseMessage()+" broken Links");
			}else {
				System.out.println(urllinks+"--->"+huc.getResponseMessage());
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
