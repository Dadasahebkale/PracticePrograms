package com.interview;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
public class ElementVisibilityTest {
public static void main(String[] args) {

		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(ops); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.freecrm.com/register/"); // enter URL
		
		//1. isDisplayed() method: applicable for all the elements
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); //for submit button
		System.out.println(b1); //true
		
		//2. isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);//false
		
		//select I Agree checkbox:
		driver.findElement(By.name("agreeTerms")).click();  //--submit button is enabled now
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);//true
		
		
		//3. isSelected() method: only applicable for checkbox, dropdown, radiobutton
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);//true
		
		
		//de-select the checkbox:
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);//false
		
		Actions a=new Actions(driver);
		a.doubleClick(driver.findElement(By.xpath("xpathofbutton")));
		
		SoftAssert sa=new SoftAssert();
		//sa.assertEquals(b4, b5);
		
		
	}
}
