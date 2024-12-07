package com.interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarOrignal {
	static WebDriver driver;
	public static void main(String[] args) {
				ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url="https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html";
		driver.get(url);
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='ui-datepicker-calendar']")));
		String monthYearVal=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYearVal);
		String month=monthYearVal.split(" ")[0].trim();
		String year=monthYearVal.split(" ")[1].trim();
		System.out.println(month);
		System.out.println(year);
		while(!(month.equals("December") && year.equals("2025"))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthYearVal=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			System.out.println(monthYearVal);
			month=monthYearVal.split(" ")[0].trim();
			year=monthYearVal.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		driver.quit();
	}
	
	
}
