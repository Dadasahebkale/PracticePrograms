package com.practiceprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkTest {
public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		List<String> urlList=new ArrayList<String>();
		for(WebElement element : allLinks) {
			String url=element.getAttribute("href");
			urlList.add(url);
			urlList.parallelStream().forEach(s->getLinks(s));
		}
		driver.quit();
	}
	public static void getLinks(String linkurl){

		try {
			URL url=new URI(linkurl).toURL();
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
