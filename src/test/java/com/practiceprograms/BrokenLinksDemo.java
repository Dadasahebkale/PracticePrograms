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

public class BrokenLinksDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fb.com");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		List<String> urls=new ArrayList<String>();
		for(WebElement element : allLinks) {
			String url=element.getAttribute("href");
			urls.add(url);
			urls.parallelStream().forEach(s->getLinks(s));
		}
		
	}
	public static void getLinks(String urllinks) {
		try {
			URL url=new URI(urllinks).toURL();
			HttpURLConnection huc=(HttpURLConnection) url.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				System.out.println(urllinks+"--->"+huc.getResponseMessage()+" is broken links");
			}else {
				System.out.println(urllinks+"--->"+huc.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
