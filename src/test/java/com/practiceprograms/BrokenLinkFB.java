package com.practiceprograms;

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

public class BrokenLinkFB {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		ops.addArguments("--incognito");
		driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fb.com");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		List<String> urlList=new ArrayList<String>();
		for(WebElement elements : allLinks) {
			String url=elements.getAttribute("href");
			urlList.add(url);
			urlList.parallelStream().forEach(e->getLink(e));
		}
		
	}
	public static void getLink(String urllink) {
		try {
			URL url=new URI(urllink).toURL();
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(urllink+"--->"+huc.getResponseMessage()+" is broken link ");
			}else {
				System.out.println(urllink+huc.getResponseMessage());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
