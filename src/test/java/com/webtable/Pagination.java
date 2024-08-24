package com.webtable;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pagination {
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	}
	@Test(priority = 1)
	public void clickFilter() {
		driver.findElement(By.xpath("//tr/th[1]")).click();
	}
	@Test(priority = 2)
	public void captureList() {
		String productName="Wheat";
		//capture all elements into the list
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all WebElements into new(Original) list 
		List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(elementList.size());
		System.out.println(originalList);
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		//scan the name column with getText()-Rice-> print of the rice
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			price=rows.stream().filter(s->s.getText().contains(productName))
					.map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			
		}while(price.size()<1);
		
	}
	public static String getPrice(WebElement s) {
	String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return priceValue;
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test(priority = 3)
	public void filterTest() {
		String productName="Wheat";
		driver.findElement(By.id("search-field")).sendKeys(productName);
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		//result 1
		List<WebElement> filterList=list.stream().filter(v->v.getText().contains(productName))
				.collect(Collectors.toList());
		Assert.assertEquals(list.size(), filterList.size());
	}

}
