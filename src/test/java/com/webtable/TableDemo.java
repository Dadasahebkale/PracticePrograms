package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableDemo {
public static WebDriver driver;
	public static void main(String[] args) {
	
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
		for(int i=1;i<rowCount;i++) {
			for(int j=1;i<=colCount;j++) {
				String actValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				//String actValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if(actValue.contains("Germany")) {
					System.out.println(i+" : "+j);
					break;
				}
			}
		}
		
			
	}
}
