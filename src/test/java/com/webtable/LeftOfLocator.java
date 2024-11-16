package com.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
public class LeftOfLocator {

	public static void main(String[] args) {
		String countryName="Afghanistan";
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		WebElement country=driver.findElement(By.xpath("//*[text()='"+countryName+"']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(country)).click();
		System.out.println(country.getText());
		List<WebElement> text=driver.findElements(By.xpath("//*[text()='"+countryName+"']/parent::td/following-sibling::td"));
		for(WebElement s : text)
		System.out.println(s.getText());
		driver.quit();
	}

}
