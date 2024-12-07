package com.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Wikipedia {

	public static void main(String[] args) {
		String url="https://www.wikipedia.org/";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		ops.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		WebElement list=driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		//System.out.println(list.size());
	//	Select select=new Select(list);
		//select.selectByVisibleText("Latina");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> l=driver.findElements(By.tagName("option"));
		//int size=l.size();
		for(WebElement e : l) {
			System.out.println(e.getText());
		}
		driver.quit();
		
	}

}
