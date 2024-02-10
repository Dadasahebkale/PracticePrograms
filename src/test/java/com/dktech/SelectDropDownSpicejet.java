package com.dktech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropDownSpicejet {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	//@Test(priority = 1)
	public void SelectDropDownTest() {
		
		
		WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select=new Select(dropdown);
		select.selectByIndex(3);
		String dropdownvalueText=select.getFirstSelectedOption().getText();
		System.out.println(dropdownvalueText);
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("INR"); // depends on value attribute need to paste from the console
		System.out.println(select.getFirstSelectedOption().getText());
		
	}
	//@Test(priority = 2)
	public void PassengerDropDownTest() {
		WebElement adult=driver.findElement(By.id("divpaxinfo"));
		WebElement adultPlust=driver.findElement(By.id("hrefIncAdt"));
		WebElement doneButton=driver.findElement(By.id("btnclosepaxoption"));
		adult.click();
		System.out.println("Before clicking on adult plus button :"+driver.findElement(By.id("divpaxinfo")).getText());

		/* int i=1;
		 * while(i<5){
		 * adultPlus.click();
		 * i++;
		 * }
		 * 
		 * */
		for(int i=1;i<5;i++) {
			adultPlust.click();	
		}
		doneButton.click();
		System.out.println("After clicking on adult plus button :"+driver.findElement(By.id("divpaxinfo")).getText());
	}
	@Test(priority = 3)
	public void dynamicDropDown() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).click();
		//Thread.sleep(2000);
		//WebElement FromCity =driver.findElement(By.xpath("//a[@value='BLR']"));
		WebElement FromCity=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Agartala']"))));
				//+ "//input[@value='Delhi (DEL)']"))));
		FromCity.click();
		//WebElement ToCity=	driver.findElement(By.xpath("(//a[@value='PNQ'])[2]"));	
		WebElement ToCity=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='Ahmedabad']"))));
		
		ToCity.click();
	}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
