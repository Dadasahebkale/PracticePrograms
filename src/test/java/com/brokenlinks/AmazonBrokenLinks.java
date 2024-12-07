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

public class AmazonBrokenLinks {
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		List<WebElement> TotalLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are :"+TotalLinks.size());
		List<String> urls=new ArrayList<String>();
		for(WebElement e : TotalLinks){
		String url=e.getAttribute("href");
		urls.add(url);
		urls.parallelStream().forEach(k->verifyAllLinks(k));
		}
	}
	public static void verifyAllLinks(String urlinks){
		try{
		URI uri=new URI(urlinks);
		URL url=uri.toURL();
		HttpURLConnection hup=(HttpURLConnection)url.openConnection();
		hup.setConnectTimeout(5000);
		hup.connect();
		if(hup.getResponseCode()>400){
		System.out.println(urlinks+"---->"+hup.getResponseMessage()+" is broken Link");
		}else{

		System.out.println(urlinks+"---->"+hup.getResponseMessage());
		}

		}catch(Exception e){

		System.out.println("Exception is : "+e.getMessage());
		}
		}


}
