package com.dynamicxpath;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonSeachPagination {

	public static WebDriver driver;

	// public static String product;
	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C://Chromedriver//chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--incognito");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);

		WebElement searchProduct = driver.findElement(By.id("twotabsearchtextbox"));
		searchProduct.clear();
		searchProduct.sendKeys("Iphone");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		searchBtn.click();

		List<WebElement> AllProducts = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> prizes = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,325)");

		String product = "Apple iPhone 14 Plus (512 GB) - Blue";

		for (int i = 0; i < AllProducts.size(); i++) {

			if (AllProducts.get(i).getText().contains(product)) {
				System.out.println(AllProducts.get(i).getText() + "----------" + prizes.get(i).getText());

			}

		}
		driver.quit();
	}

}
