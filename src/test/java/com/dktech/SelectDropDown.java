package com.dktech;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDropDown {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@Test(priority = 1)
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
	@Test(priority = 2)
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
	public void CheckBoxesTest() {
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		List<WebElement> allcheckboxes=driver.findElements(By.cssSelector("input[type*='checkbox']"));
		System.out.println(allcheckboxes.size());
	}
	@Test(priority = 4)
	public void dynamicDropDown() throws InterruptedException {
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Thread.sleep(2000);
		//WebElement FromCity =driver.findElement(By.xpath("//a[@value='BLR']"));
		WebElement FromCity=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"))));
		FromCity.click();
		String fromCity=FromCity.getText();
		System.out.println(fromCity);
		//WebElement ToCity=	driver.findElement(By.xpath("(//a[@value='PNQ'])[2]"));	
		WebElement ToCity=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']"))));
		String DestCity=ToCity.getText();
		System.out.println(DestCity);
		ToCity.click();
	}
	@Test(priority = 5)
	public void autoSuggestiveDropDown() throws InterruptedException {
		
		//Find dropdown down locator
		//type desire some keys
		//Use List of webelement
		//find locators
		//Use for loop
		//if condition=> gettext=>equalsingorecase =>provide require name=> click and use break
		WebElement drop=driver.findElement(By.id("autosuggest"));
		drop.sendKeys("Ind");
	//	Thread.sleep(3000);
		List<WebElement> autodropdown=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :autodropdown) {
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
			}
			
		}
		
	}
	@Test(priority = 6)
	public void calenderTest() {
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}
	
	@Test(priority=7)
	public void disableCalenderTest() {
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		WebElement datepicker=driver.findElement(By.id("Div1"));
		if(datepicker.getAttribute("style").contains("0.5")) {
			System.out.println("Its Disabled");
			
			Assert.assertTrue(true);
		}else {
			
			Assert.assertFalse(false);
		}
	}
	@Test(priority=8)
	public void searchTest() {
		
		WebElement searchbutton=driver.findElement(By.xpath("//span/input[@id='ctl00_mainContent_btn_FindFlights']"));
		searchbutton.click();
	}
@AfterTest
public void tearDown() {
	driver.quit();
	System.out.println("Browser has been closed");
}
}
