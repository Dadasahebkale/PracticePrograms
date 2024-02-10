package com.dktech;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTableTest {
public WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://seleniumpractise.blogspot.com/");

	}
	@Test(priority = 1)
	public void CheckBoxAndLinkTest() {
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//td//input"));
		List<WebElement> More = driver.findElements(By.xpath("//td//input//following::td[4]"));
		ArrayList<String> a=new ArrayList<String>();
		a.add("FlipKart");
		a.add("Amazon");
		a.add("Ola");
		a.add("Selenium");
		a.add("Jenkins");
		a.add("Java");
		for(int i=1;i<a.size();i++) {
			if(allcheckboxes.contains(a)) {
				
				
			}
		}
		Actions act=new Actions(driver);
		for (WebElement all :allcheckboxes) {
			all.click();	
			More.get(0).click();
			//act.keyDown(Keys.CONTROL).More.click().perform();
		}
//		for (WebElement m : More) {
//			act.keyDown(Keys.CONTROL).moveToElement(m).click().perform();
//		}
	
	}
	//@Test(priority = 0)
	public void SecondTest() {
		WebElement SeleniumCheckBox=driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input"));
		SeleniumCheckBox.click();
		WebElement clickMore=driver.findElement(By.xpath("//td[text()='Selenium']//following-sibling::td[3]/a"));
		clickMore.click();
		System.out.println("Test executed");
		driver.navigate().back();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
