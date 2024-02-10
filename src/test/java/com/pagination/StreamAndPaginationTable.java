package com.pagination;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class StreamAndPaginationTable {
	public static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// 1. click on the header column where we sort the vegi names
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// 2 capture all webElement into list
		List<WebElement> vegiNames = driver
				.findElements(By.xpath("//tr/td/preceding-sibling::td/preceding-sibling::td"));
		// 3. present list
		System.out.println(vegiNames.size());
		// 4. get original list
		List<String> originalList = vegiNames.stream().map(s -> s.getText()).collect(Collectors.toList());
		// 5 sort original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// 6 validate actual with expected-validation point
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		do {
			List<WebElement> rows = driver
					.findElements(By.xpath("//tr/td/preceding-sibling::td/preceding-sibling::td"));

			// 7 Scan name columns with getText()-> Beans -> print the price of Beans
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVegi(s))
					.collect(Collectors.toList());
			// tr/td[1]/following-sibling::td[1]
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}

		} while (price.size() < 1);

		driver.quit();
	}

	public static String getPriceVegi(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
}
