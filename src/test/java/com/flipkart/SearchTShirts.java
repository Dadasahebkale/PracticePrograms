package com.flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchTShirts {
public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//c://Chromedriver//chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		Actions a=new Actions(driver);
		WebElement fashon=driver.findElement(By.xpath("//span[text()='Fashion']"));
		a.moveToElement(fashon).perform();
		WebElement menTopWear=driver.findElement(By.cssSelector("._1BJVlg._11MZbx"));
		a.moveToElement(menTopWear).perform();
		
		WebElement mensTShirt=driver.findElement(By.linkText("Men's T-Shirts"));
		a.moveToElement(mensTShirt).click().build().perform();
		
		List<WebElement> TShirtsBrandNames=driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
		
	
		List<WebElement>AllTShirtsTypes=driver.findElements(By.cssSelector("a.IRpwTa"));

	
		List<WebElement> TShirtsPrizes=driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		
		
		for(int i=0;i<TShirtsBrandNames.size(); i++) {
			//if(TShirtsBrandNames.contains("London Hills")|AllTShirtsTypes.contains("Men Solid Round Neck Cotton Blend Black T-Shirt")
			if(TShirtsBrandNames.get(i).getText().equalsIgnoreCase("London Hills")) {
//				|TShirtsPrizes.contains("₹249")){
					System.out.println(TShirtsBrandNames.get(i).getText()+"---------|"+AllTShirtsTypes.get(i).getText()
							+"---------|"+TShirtsPrizes.get(i).getText());	
				
		}
		}
		driver.quit();
	}

}
