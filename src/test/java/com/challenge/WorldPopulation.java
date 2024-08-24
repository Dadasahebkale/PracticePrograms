package com.challenge;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorldPopulation {
	public static WebDriver driver;
	public static String xpath="//div[@class='maincounter-number']/span[@class='rts-counter']";
	public static void main(String[] args) {
		String url="https://www.worldometers.info/world-population/";
		
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		}
	
		public static void printPopulationData(String locator) {
			while(true) {
				List<WebElement> population=  driver.findElements(By.xpath(xpath));
				for(WebElement e : population)
				System.out.println(e.getText());

			}
	

		}
	
}
