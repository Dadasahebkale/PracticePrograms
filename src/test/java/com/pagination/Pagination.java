package com.pagination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pagination {
	public WebDriver driver=null;
	By nextPageButtonLocator=By.cssSelector("#advancedtable_next");
	By unviersityNames=By.xpath("//table[@id='advancedtable']/tbody/tr/td[2]");
	By search=By.cssSelector("#advancedtable_filter input[type='search']");
	By universityLink=By.xpath("//*[text()='$$']/following-sibling::td[2]");
	By advancedInfo=By.id("advancedtable_info");
	
	
	
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/advancedtable");
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
@Test
public void paginationTest() {
	List<String> universities=new ArrayList<String>();
	while(!driver.findElement(nextPageButtonLocator).getAttribute("class").contains("disabled")) {
	//List<WebElement> names=driver.findElements(unviersityNames);
	
		List<WebElement> names=driver.findElements(unviersityNames);
		for(WebElement unames: names) {
		universities.add(unames.getText().trim());
	}
	driver.findElement(nextPageButtonLocator).click();
	}
	List<WebElement> names=driver.findElements(unviersityNames);
	List<String> originalList=names.stream().map(s->s.getText()).collect(Collectors.toList());
//	System.out.println(originalList);
//	for(WebElement unames: names) {
//		universities.add(unames.getText().trim());
//	}
	universities.forEach(u->System.out.println(u));
	
	String text=driver.findElement(advancedInfo).getText().trim().split(" ")[5];
	System.out.println(text);
	//https://www.youtube.com/watch?v=Nrif2DX-qXE
}

}
