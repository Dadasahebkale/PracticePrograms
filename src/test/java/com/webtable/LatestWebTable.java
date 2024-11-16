package com.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LatestWebTable {

	public static void main(String[] args) {
		String url="https://practice.expandtesting.com/dynamic-table";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		List<WebElement> rows= driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		System.out.println("Total Rows are "+rows.size());
		for(int i=1;i<rows.size();i++) {
			WebElement names=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+i+"]/td[1]"));
			if(names.getText().equals("Chrome")) {
			String cpUtext=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
			//System.out.println(cpUtext);
			String value=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();	
			//System.out.println(value);
			if(value.contains(cpUtext)) {
				System.out.println("CPU load of chrome is equal.. ");
			}else {
				System.out.println("CPU load of chrome is not equal.");
			}
			break;
			}
		}
		driver.quit();
	}
	

}
