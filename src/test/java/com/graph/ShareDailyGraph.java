package com.graph;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShareDailyGraph {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions a=new Actions(driver);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("HDFC bank shares");
		search.submit();
		
		js.executeScript("window.scrollBy(0,190)");
		WebElement element = driver.findElement(By.xpath("//*[name()='svg' and @class='uch-psvg']"));
		
		
		int getToLeftx=((element.getSize().getWidth())/2)-element.getSize().getWidth();
		int getTopLefty=((element.getSize().getHeight())/2)-element.getSize().getHeight();
		
		for(int i=0;i<550;i++) {
			//Thread.sleep(200);
		a.moveToElement(element, getToLeftx+i, getTopLefty).perform();
		String values=driver.findElement(By.xpath("//span[@class='knowledge-finance-wholepage-chart__hover-card-value']")).getText();
		System.out.println(values);
		}
		
		
		
	}

}
