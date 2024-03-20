package com.selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SearchOptions {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.out.println("Enter option for search....");
		Scanner sc=new Scanner(System.in);
		String etext=sc.nextLine();
		int found=0;
		System.out.println("Searching.........");
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.get("E:\\Manual Testing\\Naveen\\API\\JsonFiles\\html\\demo1.html");
		
		WebElement listbox=driver.findElement(By.name("Country"));
		Select select=new Select(listbox);
		List<WebElement> allOptions=select.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			String text=allOptions.get(i).getText();
			if(text.equals(etext)) {
				found++;
			}
		}
		if(found==0) {
			System.out.println(etext+"  is not found");
		}else if(found==1){
			System.out.println(etext+" is found");
		}else {
			System.out.println(etext+" is duplicate");
		}
		driver.quit();
		

	}

}
