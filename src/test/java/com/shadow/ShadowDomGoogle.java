package com.shadow;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDomGoogle {

	public static void main(String[] args) {
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("chrome://downloads/");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement search=(WebElement)js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm>input#searchInput')");
		//WebElement temp=(WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		
		//String str="arguments[0].setAttribute('value','downloading item list from the chrome')";
		String srch="arguments[0].setAttribute('value','DadasahebKale search items')";
		((JavascriptExecutor)driver).executeScript(srch, search);
		//((JavascriptExecutor)driver).executeScript(str, temp);
	}

}
