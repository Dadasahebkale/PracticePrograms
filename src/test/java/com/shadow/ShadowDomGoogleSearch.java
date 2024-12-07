package com.shadow;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDomGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("chrome://settings/");
		
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
				WebElement search=(WebElement)js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
				
				String text="arguments[0].setAttribute('value','Google search testing with shadow dom')";
				
				((JavascriptExecutor)driver).executeScript(text, search);
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].value='';", search);
				
	}

}
