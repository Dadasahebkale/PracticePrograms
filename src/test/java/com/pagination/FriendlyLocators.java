package com.pagination;

import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FriendlyLocators {

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("117");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	}

	@Test
	public void NameTest() {
		WebElement nameEditBox = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		waitUtils();
		
	}
	@Test
	public void DOBTest() {
		WebElement birthDate = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(birthDate)).click();
		waitUtils();
	}
	@Test
	public void iceCreamTest() {
		WebElement iceCreamcheckbox = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamcheckbox)).click();
		waitUtils();
	}
	@Test
	public void radioButtonTest() {
		WebElement radiobtn = driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
		driver.findElement(with(By.tagName("div")).toRightOf(radiobtn)).click();
		waitUtils();
	}
	@Test
	public void widthHeightTest(){
		WebElement nameEditBox = driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']"));
		System.out.println(nameEditBox.getRect().getDimension().getHeight());
		System.out.println(nameEditBox.getRect().getDimension().getWidth());
		waitUtils();
	}
	public static void waitUtils() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
