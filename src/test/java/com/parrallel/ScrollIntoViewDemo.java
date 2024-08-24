package com.parrallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollIntoViewDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement search=
		driver.findElement(By.name("q")).sendKeys("iPhone 15 pro");
		// js.executeScript("arguments[0].value='iPhone 15 pro';",search);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		// js.executeScript("arguments[0].click();", submit);
		// submit.click();
		Thread.sleep(3000);

		WebElement nextbutton = driver.findElement(By.cssSelector("a[class='_1LKTO3'] span"));
		js.executeScript("arguments[0].click();", nextbutton);
		System.out.println(nextbutton.getText());
		WebElement Productname = driver
				.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (Black Titanium, 1 TB)']"));
		System.out.println("Product name :" + Productname.getText());
		Productname.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
