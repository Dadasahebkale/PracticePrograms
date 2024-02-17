package com.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']")).sendKeys("411014");
		driver.findElement(By.xpath("(//span[@class='a-button-inner a-declarative'])[3]")).click();
		String deal="//span[text()='Amazon Business']/parent::a/following-sibling::a[1]";
		driver.findElement(By.xpath(deal)).click();
		

		
		
	}

}
