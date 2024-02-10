package com.dynamicxpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("latest movies");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i).getText());
			String text=list.get(i).getText();
			System.out.println(text);
			if(list.get(i).getText().equals("latest movies to watch")) {
				list.get(i).click();
				break;
			}
			
		}
		
	}

}
