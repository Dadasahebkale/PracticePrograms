package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
public static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("file:///E:/Manual%20Testing/Naveen/API/JsonFiles/html/demo1.html");
		//System.out.println(driver.getTitle());
		WebElement countryName= driver.findElement(By.name("Country"));
		Select select=new Select(countryName);
		select.selectByIndex(4);
		List<WebElement> allCountry=select.getOptions();
		for(int i=0;i<allCountry.size();i++) {
			WebElement option=allCountry.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		driver.quit();
	}

}
