package com.dktech;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.ExcelReader;

public class TableTest {
	public static String url="D:\\CucumberLatest\\Automation\\src\\test\\resources\\properyfile\\config.properties";
	public static WebDriver driver;
	public static ChromeOptions ops;
	public static Properties prop;
	public static FileInputStream fis;
	public static ExcelReader excel;
	public static String testCaseName;
	public static Hashtable<String, String> run_mode=new Hashtable<String, String>();
	@Test(priority = 1)
	public void tableTest() throws IOException {
		ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/");
		prop=new Properties();
		fis=new FileInputStream(url);
		prop.load(fis);
	//	excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Master_Sheet.xlsx");
		
		int allcheckboxes = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int moreOption = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		Actions act=new Actions(driver);
		for(int i=1;i<allcheckboxes;i++) {
			for(int j=1;j<=moreOption;j++) {
				String value=driver.findElement(By.xpath("//table[@id='customers']//tr["+(i+1)+"]/td["+j+"]")).getText();
				
				if(value.contains(prop.getProperty("myvalue"))) {
					WebElement SeleniumCheckBox=driver.findElement(By.xpath("//td[text()='"+value+"']//preceding-sibling::td//input"));
					SeleniumCheckBox.click();
				
					WebElement clickMore=driver.findElement(By.xpath("//td[text()='"+value+"']//following-sibling::td//a"));
					act.keyDown(Keys.CONTROL).moveToElement(clickMore).click().perform();
					System.out.println(i+" : "+j);
					break;
				}
				
			}
		}
		
	}
	@Test(priority = 2,dataProvider = "data_Collection")
	public void excelTestData(Hashtable<String, String> hdata) {
		int allcheckboxes = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int moreOption = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		Actions act=new Actions(driver);
		for(int i=1;i<allcheckboxes;i++) {
			for(int j=1;j<=moreOption;j++) {
				String value=driver.findElement(By.xpath("//table[@id='customers']//tr["+(i+1)+"]/td["+j+"]")).getText();
				
				if(value.contains(prop.getProperty(hdata.get("Value")))) {
					WebElement SeleniumCheckBox=driver.findElement(By.xpath("//td[text()='"+value+"']//preceding-sibling::td//input"));
					SeleniumCheckBox.click();
				
					WebElement clickMore=driver.findElement(By.xpath("//td[text()='"+value+"']//following-sibling::td//a"));
					act.keyDown(Keys.CONTROL).moveToElement(clickMore).click().perform();
					System.out.println(i+" : "+j);
					break;
				}
				
			}
			}
	}
	
	@AfterTest
	public void tearTown() {
		driver.quit();
	}

}
