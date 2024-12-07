package com.brokenlinks;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink {
	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.addArguments("--headless");
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		List<String>urls=new ArrayList<String>();
		for(WebElement element : allLinks) {
			String url=element.getAttribute("href");
			urls.add(url);
			urls.parallelStream().forEach(s->getLinks(s));
		}
		driver.quit();
	}
	public static void getLinks(String linkurl) {
		try {			
			URI uri=new URI(linkurl);
			URL url=uri.toURL();
			HttpURLConnection urlconnection=(HttpURLConnection)url.openConnection();
			urlconnection.setConnectTimeout(5000);
			urlconnection.connect();
			if(urlconnection.getResponseCode()>400) {
				System.out.println(linkurl+"------>"+urlconnection.getResponseMessage()+" Broken Links");
			}else {
				System.out.println(linkurl+"------>"+urlconnection.getResponseMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
