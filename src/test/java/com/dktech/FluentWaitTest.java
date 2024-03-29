package com.dktech;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {

	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		String url="https://the-internet.herokuapp.com/dynamic_loading/1";
		driver.get(url);
		WebElement startbutton=driver.findElement(By.cssSelector("[id='start'] button"));
		startbutton.click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(ElementClickInterceptedException.class);
		
		WebElement foo=wait.until(new Function<WebDriver,WebElement>(){
		
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}else {
					return null;
				}
				
			}
			
		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
				
		

	}

}
