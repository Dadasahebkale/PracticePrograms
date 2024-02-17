package com.dynamicxpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaTutorialSearch {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.javatpoint.com/java-tutorial");
		
	}
	@Test
	public void javaTutorialTest() {
		WebElement search=driver.findElement(By.cssSelector("#gsc-i-id1"));
		search.sendKeys("java");
		search.sendKeys(Keys.SPACE);
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='gsc-completion-container']//tbody/tr/descendant::span/b"));
		String s="interview question";
		
		for(int i=0;i<list.lastIndexOf(s);i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains(s)) {
				list.get(i).click();
				break;
			}
		}

	}
	

}
