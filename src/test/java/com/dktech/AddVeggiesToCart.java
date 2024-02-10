package com.dktech;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddVeggiesToCart {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

	//System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");

	driver =new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/seleniumPractise/");

	driver.manage().window().maximize();

	String[] addItem = {"Potato", "Cauliflower", "Onion", "Tomato"};

	List<String> addItemList = Arrays.asList(addItem);

	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']/button"));

	String[] productArray;

	String product;

	int j = 0;



	for(int i = 1;i<products.size();i++) {

	productArray = products.get(i).getText().split("-");

	product = productArray[0].trim();

	if (addItemList.contains(product)) {

	j++;

	buttons.get(i).click();

	Thread.sleep(3000);

	if (j == (addItem.length)) {

	break;

	}

	}

	}
	}

}
