package com.pagination;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaginationTest {
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@Test(priority = 1)
	public void captureList() {
	String productName="Product 20";
	////ul[@class='pagination']/li/following-sibling::li
	//capture all elements into the list
	List<WebElement> elementList=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
	//capture text of all WebElements into new(Original) list 
	List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
	System.out.println(elementList.size());
	System.out.println(originalList);
	List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(originalList.equals(sortedList));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	
	List<String> price;
	//scan the name column with getText()-Rice-> print of the rice
	do {
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
		price=rows.stream().filter(s->s.getText().equalsIgnoreCase(productName))
				.map(s->getPrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1) {
			//driver.findElement(By.cssSelector(".active")).click();
			driver.findElement(By.xpath("//ul[@class='pagination']/li/following-sibling::li")).click();
		}
		
	}while(price.size()<1);
	}
	public static String getPrice(WebElement s) {
		String priceValue=s.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[3]")).getText();
		return priceValue;
		}

}
