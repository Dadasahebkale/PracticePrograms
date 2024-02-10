package com.graph;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SvgGraphHandle {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--headless");
		driver=new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		
		String verifyXpath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		String textpath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		List<WebElement> barList=driver.findElements(By.xpath(verifyXpath));
		System.out.println("Total gragph on the charts is "+barList.size());
		Actions a=new Actions(driver);
		for(WebElement e : barList) {
			a.moveToElement(e).perform();
			//Thread.sleep(500);
			String text=driver.findElement(By.xpath(textpath)).getText();
			System.out.println(text);
		}
	driver.quit();
	}
}
