package com.dynamicxpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOnFlipCart {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		
		WebElement searchProduct =driver.findElement(By.name("q"));
		searchProduct.sendKeys("Iphone 14");
		WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
		searchButton.click();
		String modelName="Apple iPhone 14 (Yellow, 128 GB)";
		String productName=driver.findElement(By.xpath("//div[@class='col col-7-12']/descendant::*[text()='"+modelName+"']")).getText();
	   String price=driver.findElement(By.xpath("//*[contains(text(),'"+modelName+"')]//parent::div/parent::div/child::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		
	  System.out.println("Model Name is ==>"+ productName +" and price is ::=> "+price);
		//*[contains(text(),'Apple iPhone 14 (Blue, 128 GB)')]//parent::div/parent::div/child::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']
	//div[@class='col col-7-12']/descendant::*[text()='Apple iPhone 14 (Blue, 128 GB)']
	}

}
