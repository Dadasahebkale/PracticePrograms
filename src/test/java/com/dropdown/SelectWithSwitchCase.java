/**
 * 
 */
package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * 
 */
public class SelectWithSwitchCase {

	public static WebDriver driver;
	public static String url="https://demo.guru99.com/test/newtours/register.php";
	
	@BeforeTest
	public void launchBrower() {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
}
	@Test
	public void TestDemo() {
		By ProductName=By.xpath("//select[@name='country']");
		//By AnimalName=By.xpath("//select[@id='animals']");
		//selectDropDownValue(ProductName,DropDown.INDEX.toString(),"3");
		//selectDropDownValue(ProductName, DropDown.VisibleText.toString(), "ALGERIA");
		selectDropDownValue(ProductName, DropDown.VALUE.toString(), "ARUBA");
	}
	public static void selectDropDownValue(By locator,String type,String value) {
		Select select=new Select(getElement(locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibleText":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("Please pass the correct selection criteria .....");
			break;
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}