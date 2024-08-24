package com.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaginationTable {
	public static String name = "Dadasaheb";
	public static WebDriver driver = null;

	@BeforeTest
	public static void SetUp() {

		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	@Test(enabled = false)
	public static void rowsColsTest() {
		List<WebElement> rowsCount=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		List<WebElement> colsCount=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Rows Count :"+rowsCount.size()+": Cols Count"+colsCount.size());
		for(int i=2;i<rowsCount.size();i++) {
			
			for(int j=1;j<colsCount.size();j++) {
				//String actValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				String data=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);
			}
			
		}
	}
	@Test
	public static void Pagination() {
		List<WebElement> rowsCount=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
		List<WebElement> colsCount=driver.findElements(By.xpath("//table[@id='productTable']/thead/tr/th"));
		System.out.println("Rows Count :"+rowsCount.size()+" : Cols Count :"+colsCount.size());
		for(int i=2;i<rowsCount.size();i++) {
			
			for(int j=1;j<colsCount.size();j++) {
				//String actValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				//String data=driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/../parent::*/thead/tr/th["+j+"]")).getText();
				String data=driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				System.out.println(data);
			}
			
		}
	}
	
@AfterTest
public void tearDown() {
	driver.quit();
}

}
