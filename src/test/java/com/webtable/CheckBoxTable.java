package com.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxTable {

	static WebDriver driver;
	static String url="https://cosmocode.io/automation-practice-webtable/";
	public static void main(String[] args) {
		String name="India";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		WebElement countryName=driver.findElement(By.xpath("//*[text()='"+name+"']"));
		System.out.println(countryName.getText());
		WebElement checkBox=driver.findElement(By.xpath("//*[text()='"+name+"']/parent::td/preceding-sibling::td/input"));
		checkBox.click();
		System.out.println("Click on the checkbox");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[text()='"+name+"']/parent::td/following-sibling::td"));
		for(WebElement s : list) {
			System.out.println(s.getText());
		}		
		driver.quit();
		
		System.out.println("Driver has been closed");

	}

}
