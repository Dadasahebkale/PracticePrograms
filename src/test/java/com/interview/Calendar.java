package com.interview;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
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
		
		selectDate("20", "February", "2025");
		driver.quit();
	}
	public static String[] getMonthYear(String monthYearVal) {
		return monthYearVal.split(" ");
	}
	public static void selectDate(String exDay, String exMonth, String exYear) {
				
		if(exMonth.equals("February") && Integer.parseInt(exDay)>29) {
			System.out.println("Wrong date :"+exMonth+" : "+exDay);
			return;
		}
		if(Integer.parseInt(exDay)>31) {
			System.out.println("Wrong date :"+exMonth+" : "+exDay);
			return;
		}
		
		String monthYearVal=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthYearVal);
		while(!(getMonthYear(monthYearVal)[0].equals(exMonth) && getMonthYear(monthYearVal)[1].equals(exYear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthYearVal=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
	
		try {
		
		driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
		}
		catch(Exception e) {
			System.out.println("Wrong date :"+exMonth+" : "+exDay);
		}
		}
	
}
