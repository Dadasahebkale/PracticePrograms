package com.parrallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParrallelExecution {
	//WebDriver driver;
	@Test
	public void firstTest() throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("FirstTest "+Thread.currentThread().getId());
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void SecondTest() throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
		System.out.println("Second Test "+Thread.currentThread().getId());
		Thread.sleep(2000);
		driver.quit();
	}

}
