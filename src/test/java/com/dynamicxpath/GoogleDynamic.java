package com.dynamicxpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.window.WindowHandles;

public class GoogleDynamic {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C://Chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("cricbuzz");
		

		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));


		for(int i=0;i<list.size();i++){

		System.out.println(list.get(i).getText());

		if(list.get(i).getText().equals("cricbuzz ind vs sl")){
			
			list.get(i).click();
			break;	
		}
		
		}
		driver.quit();
	}

}
