package com.frame;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesTest {
	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("117");
		driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("Selenium with Java");
			List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='wM6W7d']"));
			//list.stream().filter(s->s.getText())
			for(int i=0;i<list.size();i++) {
				String it=list.get(i).getText();
				System.out.println(it);
				if(it.equalsIgnoreCase("selenium with java books")) {
					list.get(i).click();
					break;
				}
			}
		}finally {
		
			tearDown();
		}
		

	}
	public static void tearDown() {

		driver.quit();
	}
	public static WebElement myWait(WebDriver driver, By by) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
