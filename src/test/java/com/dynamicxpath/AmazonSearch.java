package com.dynamicxpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSearch {

	public static WebDriver driver;
	public static String product;
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("--headless=new");
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		WebElement searchProduct=driver.findElement(By.id("twotabsearchtextbox"));
		searchProduct.clear();
		searchProduct.sendKeys("Iphone");
		WebElement searchBtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		searchBtn.click();
		//String nextButton=driver.findElement(By.xpath("//a[text()='Next']")).getAttribute("class");
		
		List<WebElement> AllProducts=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prizes=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		product="Apple iPhone 13 (128GB) - Midnight";
//		while(!nextButton.contains("disabled")) {
//			
	//driver.findElement(By.xpath("//a[text()='Next']")).click();
//			for(int i=0;i<AllProducts.size();i++) {
//				System.out.println(AllProducts.get(i).getText()+"----------"+prizes.get(i).getText());
//		}
		for(int i=0;i<AllProducts.size();i++) {
			if(AllProducts.get(i).getText().contains(product)) {
				System.out.println(AllProducts.get(i).getText()+"----------"+prizes.get(i).getText());
				break;
			}
			
	}
		driver.quit();
	}

}
