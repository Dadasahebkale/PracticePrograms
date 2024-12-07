package com.frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("117");
		ops.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(frame);
		//WebElement element=driver.findElement(By.xpath("//div[@id='courses-block']/div//h2/a[text()='Cypress-Modern Automation Testing from Scratch + Framework']"));
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='courses-block']/div//h2/a"));
		for(WebElement e : list) {
			String str=e.getAttribute("href");
			if(str.equalsIgnoreCase("software-quality-assurance-engineer")) {
				e.click();
				break;
			}
			System.out.println(str);
		}
		
		System.out.println("User clicked on course");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alrt=driver.switchTo().alert();
		Thread.sleep(3000);
		alrt.accept();
		System.out.println("User accepted alert");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		alrt.dismiss();
		
		driver.quit();
	}

}
