package com.selenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DuplicateListItems {
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.get("E:\\Manual Testing\\Naveen\\API\\JsonFiles\\html\\demo1.html");
		WebElement listBox=driver.findElement(By.name("Country"));
		Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		HashSet<String> allText=new HashSet<String>();
		for(int i=0;i<allOptions.size();i++) {
			String text=allOptions.get(i).getText();
			if(allText.add(text)==false) {
				System.out.println(text);
			}
		}
		driver.quit();
	}

}
