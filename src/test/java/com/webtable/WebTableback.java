package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableback {
public static WebDriver driver=null;
static String CountyName="The Bahamas";
	public static void main(String[] args) {
		try {
		String url="https://cosmocode.io/automation-practice-webtable";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("116");
		driver=new ChromeDriver(ops);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement st= driver.findElement(By.xpath("//table[@id='countries']/tbody/tr/td[2]/strong[text()='"+CountyName+"']"));
		System.out.println(st.getText());
		
		WebElement checkbox=driver.findElement(By.xpath("//table[@id='countries']/tbody/tr/td[2]/strong[text()='"+CountyName+"']/../..//input[@type='checkbox']"));
		checkbox.click();
		////*[text()='Algeria']//parent::td/..//input[@type='checkbox']
		//table[@id='countries']//tbody//tr//td[2]/strong[text()='Albania']/parent::td//preceding-sibling::td//input[@type='checkbox']
		
		}
		catch(Exception e) {
			System.out.println("Exception is coming....");
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
		
	}

}
