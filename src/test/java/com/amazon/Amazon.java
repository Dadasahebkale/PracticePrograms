package com.amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		driver =new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#glow-ingress-line2")).click();
		Thread.sleep(1000);
		List<WebElement> d= driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(d.size());
		driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")).sendKeys("411014");
		driver.findElement(By.xpath("(//span[@class='a-button-inner a-declarative'])[3]")).click();
		for(int i=0;i<d.size();i++) {
			String s=d.get(i).getAttribute("href");
			System.out.println(s);
		}
		
		String deal="//span[text()='Amazon Business']/parent::a/following-sibling::a[1]";
		//driver.findElement(By.xpath(deal)).click();
		

		
		
	}

}
