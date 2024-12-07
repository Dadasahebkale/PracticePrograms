package com.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mysql.cj.jdbc.Driver;

public class RefreshPageMethods {

	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		System.out.println("User lanch flipkart application using get method");
		driver.navigate().refresh();
		System.out.println("User refereshed the page using navigate and referesh method");
		driver.get("https://www.flipkart.com/");
		System.out.println("User refresh using urls get method");
		driver.get(driver.getCurrentUrl());
		System.out.println("User refresh using getCurrentURL method");
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("Navigate to method");
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		System.out.println("Using Keys f5");
		driver.quit();

	}

}
