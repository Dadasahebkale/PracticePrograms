package com.dynamicxpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YouTubSearch {
	public static WebDriver driver;
	
	@BeforeTest
	public void YouTubeLuanch() {
	//	System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com");
	}
	@Test
	public void youtubeSearchTest() throws InterruptedException {
		Thread.sleep(100);
		driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[7]")).click();
		Thread.sleep(100);
	WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("news");
	Thread.sleep(100);
	search.sendKeys(Keys.SPACE);
		List<WebElement> List=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
				//ul[@class='sbsb_b']//li/descendant::div[@class='sbqs_c']/b"));
		System.out.println(List.size());
		String s="live marathi";
	//	Actions a=new Actions(driver);
		Thread.sleep(100);
		for(WebElement e : List) {
			System.out.println(e.getText());
			if(e.getText().contains(s)){
			//a.moveToElement(e).click().build().perform();
				e.click();
				break;	
			}
			
		}
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
