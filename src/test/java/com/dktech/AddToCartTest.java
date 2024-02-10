package com.dktech;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCartTest {
public static WebDriver driver;

@BeforeTest
public void launchBrowser() {
	ChromeOptions ops=new ChromeOptions();
	ops.setBrowserVersion("117");
	driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
}
@Test
public void AddCartTest() throws InterruptedException {
	int j=0;
	String[] itemsneeded= {"Brocolli","Cauliflower","Cucumber","Beetroot","Carrot","Tomato","Beans","Brinjal","Mushroom"};
	
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	List<WebElement> buttons= driver.findElements(By.xpath("//div[@class='product-action']/button"));
	String[] name;
	String formatName;
	
	for(int i=0;i<products.size();i++) {
		// Brocolli - 1 Kg
		// names are not in proper way
		//Splits the names, and trim its
		name=products.get(i).getText().split("-");
		formatName=name[0].trim();
		//convert array into arrayList for easy search
		//check whether name you extracted is present in arrayList or not
		List<String> itemlist=Arrays.asList(itemsneeded);	
		if(itemlist.contains(formatName)) {
			j++;
			buttons.get(i).click();
			////div[@class='product-action']
			//button[text()='ADD TO CART']
			//break; we can't use break in the array list, single item we can use break keyword to avoid iteration
			System.out.println(formatName);
			Thread.sleep(1000);
			if(j==itemsneeded.length) {
				break;
			}
				
		}
	}
}
@AfterTest
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}
