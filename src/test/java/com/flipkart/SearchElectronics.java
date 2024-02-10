package com.flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchElectronics {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Chromedriver//chromedriver.exe");

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");

		Actions a=new Actions(driver);
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		a.moveToElement(electronics).perform();

		WebElement audio=driver.findElement(By.xpath("//a[text()='Audio']"));
		a.moveToElement(audio).perform();

		WebElement bluetooth=driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"));
		a.moveToElement(bluetooth).click().build().perform();
		
		List<WebElement> HeadPhoneBrands=driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		List<WebElement> productDetails=driver.findElements(By.xpath("//div[@class='_3Djpdu']"));
		List<WebElement> headPhonePrices=driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		
		for(int i=0;i<HeadPhoneBrands.size();i++) {
			System.out.println(HeadPhoneBrands.get(i).getText()+"----------"+productDetails.get(i).getText()+"-------"+headPhonePrices.get(i).getText());
		}

	}

}
