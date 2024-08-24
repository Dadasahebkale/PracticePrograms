package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		//ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Welcome");
		
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		String text=box2.getAttribute("value");
		System.out.println("Captured text..."+text);
		
		if(text.equals("Welcome")) {
			System.out.println("Text is copied...");
		}else {
			System.out.println("Text is not copied");
		}
		
	}

}
