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

public class SampleTable {
	public static String name = "Dadasaheb";
	public static WebDriver driver = null;

	@BeforeTest
	public static void SetUp() {

		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("E://Preparation//SampleWebTable.html");
		// driver.findElement(By.cssSelector("input[id='student1']")).click();

		


	}

	@Test
	public static void checkBoxTest() {
		driver.findElement(By.xpath("//td[text()='dadasahebkale@abc.com']/preceding-sibling::td[3]/input")).click();
		System.out.println("Clicked on checkbox");
	}
	@Test
	public static void ParticularRow() {
		List<WebElement> rowDetails = driver.findElements(
				By.xpath("//td[text()='" + name + "']/preceding-sibling::td/input/parent::*/following-sibling::td"));
		for (WebElement ee : rowDetails) {
			System.out.println(ee.getText());
		}
	}
	@Test
	public static void allLinkTest() {

		List<WebElement> urls = driver.findElements(By.xpath("//table/tbody/tr/td[6]/a"));
		for (WebElement e : urls) {
			System.out.println(e.getText());
		}
	}
	@Test
	public static void RowColmnCount() {
		System.out.println("===================================================");
		List<WebElement> rowCount=driver.findElements(By.xpath("//table/tbody/tr"));
	//	System.out.println(rowCount.size());
		List<WebElement> colsCount=driver.findElements(By.xpath("//table/tbody/tr/th"));
		//System.out.println(colsCount.size());
		
		for(int row=2;row<rowCount.size();row++) {
		
			for(int cols=1;cols<colsCount.size();cols++) {
				WebElement data=driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+cols+"]"));
				System.out.print(data.getText());
			}
		}
	}

	@AfterTest
	public static void tearDown() {
		driver.quit();
	}

}
