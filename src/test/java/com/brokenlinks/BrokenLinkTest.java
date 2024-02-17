package com.brokenlinks;

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

public class BrokenLinkTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Chromedriver//chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.fb.com");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total links "+allLinks.size());

		List<String> urlList=new ArrayList<String>();

		for(WebElement e : allLinks){
		String url=e.getAttribute("href");
		urlList.add(url);

		}
		long st=System.currentTimeMillis();
		urlList.parallelStream().forEach(e->checkBrokenLink(e));
		long et=System.currentTimeMillis();
		System.out.println("Total Time is "+(et-st));
		driver.quit();
		}

		public static void checkBrokenLink(String UrlLink){


		try{
		URL url=new URL(UrlLink);
		HttpURLConnection httpurlConnection=(HttpURLConnection) url.openConnection();
		httpurlConnection.setConnectTimeout(5000);
		httpurlConnection.connect();

		if(httpurlConnection.getResponseCode()>=400){
		System.out.println(UrlLink+" ---> "+ httpurlConnection.getResponseMessage() + " is broken link");

		}else{

		System.out.println(UrlLink+" ---> "+httpurlConnection.getResponseMessage());
		}



		}catch(Exception e){
		System.out.println(e.getMessage());

		}
		}

	

}
