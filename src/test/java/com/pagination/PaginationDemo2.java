package com.pagination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaginationDemo2 {
	public WebDriver driver=null;
	
	@BeforeTest
	public void setUp() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void paginationTest() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		List<WebElement> tableContains=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
		List<String> originalList=tableContains.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//System.out.println(originalList);
		//String nextbtn=driver.findElement(By.xpath("//button[@class='dt-paging-button disabled next']")).getAttribute("class");
		WebElement nextbtn=driver.findElement(By.xpath("//button[@type='button' and @class='dt-paging-button']"));
		 if (nextbtn != null && nextbtn.isEnabled()) {
			 nextbtn.click();
	//	while(!nextbtn.contains("disabled")) {
			////button[@class='dt-paging-button']/parent::*/child::*
			 driver.findElement(By.xpath("//button[@type='button' and @class='dt-paging-button']")).click();
			//div[@class='dt-layout-row']/following-sibling::div/descendant::td
			//driver.findElement(By.xpath("//div[@class='dt-paging paging_full_numbers']/button[@class='dt-paging-button']")).click();
			tableContains=driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
			List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
			originalList=tableContains.stream().map(s->s.getText()).collect(Collectors.toList());
	
		//	System.out.println(originalList);
			//Assert.assertEquals(originalList, sortedList);
			//WebElement nextbstn=driver.findElement(By.xpath("//button[@type='button']"));
			nextbtn.click();
		}
		originalList.stream().forEach(s->System.out.println(s));

		int totalNames=originalList.size();
		System.out.println("Total number of names "+totalNames);
		String displayedCount=driver.findElement(By.xpath("//div[@id='example_info']")).getText().split(" ")[5];
		System.out.println("Total number of displayed names count "+displayedCount);
		//Assert.assertEquals(displayedCount, String.valueOf(totalNames));
		
		Thread.sleep(5000);
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	

}
