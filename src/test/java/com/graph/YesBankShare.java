package com.graph;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YesBankShare {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		String url="https://www.google.com/search?q=yes+bank+share&rlz=1C1RXQR_enIN988IN988&oq=ye&gs_lcrp=EgZjaHJvbWUqEQgAEEUYJxg7GJ0CGIAEGIoFMhEIABBFGCcYOxidAhiABBiKBTIGCAEQRRg5MhMIAhAuGIMBGMcBGLEDGNEDGIAEMg0IAxAAGIMBGLEDGIAEMg0IBBAAGIMBGLEDGIAEMgYIBRAAGAMyEAgGEAAYgwEYsQMYgAQYigUyBwgHEAAYgAQyBwgIEAAYgAQyBggJEAAYA9IBCDMwNzJqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8";
		driver.get(url);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,190)");
		
		WebElement ele =driver.findElement(By.xpath("//*[name()='svg' and @class='uch-psvg']"));
		
		
		int getTopLeftY=((ele.getSize().getHeight())/2)-ele.getSize().getHeight();
		int getTopLeftX=((ele.getSize().getWidth())/2)-ele.getSize().getWidth();
		Actions a=new Actions(driver);
		for(int i=0;i<550;i++) {
		
			a.moveToElement(ele, getTopLeftX+i, getTopLeftY).perform();
			String values=driver.findElement(By.xpath("//span[@class='knowledge-finance-wholepage-chart__hover-card-value']")).getText();
		System.out.println(values);
		}
		
	}

}
