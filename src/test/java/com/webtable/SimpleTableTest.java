package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleTableTest {
public static String url="https://demo.guru99.com/test/web-table-element.php";
public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		
		int rowCount=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int colCount=driver.findElements(By.xpath("//table[@class='dataTable']//tr//td")).size();
		String rowXpath="//table[@class='dataTable']/tbody/tr";
		String colXpath="//table[@class='dataTable']/tbody/tr/td";
		
		System.out.println(rowCount+" : "+colCount);
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String searchValue=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
				if(searchValue.equalsIgnoreCase("BEML Ltd.")) {
					System.out.println(i+" : "+j);
					break;
				}
				
			}
			
		}
		
	}

}
