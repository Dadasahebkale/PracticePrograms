package com.practiceprograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		ops.addArguments("--incognito");
		driver =new ChromeDriver(ops);
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		List<String> urlList=new ArrayList<String>();
		for(WebElement element : allLinks) {
			String url=element.getAttribute("href");
			urlList.add(url);
			urlList.parallelStream().forEach(e->getAllLinks(e));
		}
		driver.quit();
	}
	public static void getAllLinks(String linkurl) {
		try {
			@SuppressWarnings("deprecation")
			URL url=new URL(linkurl);
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(linkurl+"--->"+huc.getResponseMessage()+" is broken link");
			}else {
				System.out.println(linkurl+"--->"+huc.getResponseMessage());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
