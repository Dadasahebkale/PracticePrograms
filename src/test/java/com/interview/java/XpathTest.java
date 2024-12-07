package com.interview.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class XpathTest {
	WebDriver driver;
	@Test
	public void NewStatus() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url="https://www.google.com/search?q=news+section&sca_esv60d606574466e04&biw=1707&bih=722&tbm=nws&sxsrf=ADLYWILF7Es5ej0WZ-V7AJnI_mmyzZm-uQ%3A1733489237673&ei=VfJSZ4vbKOqcseMPs8Xk6Ak&ved=0ahUKEwjL2e7RlpOKAxVqTmwGHbMiGZ0Q4dUDCA0&uact=5&oq=news+section&gs_lp=Egxnd3Mtd2l6LW5ld3MiDG5ld3Mgc2VjdGlvbjIKEAAYgAQYQxiKBTIFEAAYgAQyBRAAGIAEMgoQABiABBhDGIoFMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAESJwGUABYAHAAeACQAQCYAZsCoAGbAqoBAzItMbgBA8gBAJgCAaACpgKYAwCIBgGSBwMyLTGgB6UF&sclient=gws-wiz-news";
		driver.get(url);
		List<WebElement> list=driver.findElements(By.xpath("//span[contains(text(),'8 hours ago')]/parent::div/preceding-sibling::div[@role='heading']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}
	@Test
	public void ZAmazon() {
		driver.get("https://www.amazon.in/");
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='nav-xshop']/child::a/following::a"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}
	@AfterTest
	public void tearDowon() {
		driver.quit();
		
	}

}
