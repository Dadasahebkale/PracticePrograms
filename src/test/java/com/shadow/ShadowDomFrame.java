package com.shadow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDomFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		WebElement username=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector('#kils')");
		String user="arguments[0].setAttribute('value','dadasahebkale@abc.com')";
		//System.out.println("Details entered using javascript");
				
		WebElement pizza=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		String piz="arguments[0].setAttribute('value','Green shandwitch pizza')";
		
		((JavascriptExecutor)driver).executeScript(user,username);
		System.out.println("Details entered using user name");
		((JavascriptExecutor)driver).executeScript(piz,pizza);
		System.out.println("Details entered for piza");
		
		driver.switchTo().frame("coming google");
		
		
		driver.quit();
		

	}

}
