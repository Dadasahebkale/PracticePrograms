package com.dropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DropDownTest {
	public static String browser="chrome";
	public static WebDriver driver;
	@BeforeSuite
	public void SetUp() {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions co=new ChromeOptions();
			co.setBrowserVersion("117");
			driver=new ChromeDriver(co);
			System.out.println("Chrome Browser has been launched");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edge Browser has been launched");
		}
		else if(browser.equalsIgnoreCase("ff")) {
			driver=new FirefoxDriver();
			System.out.println("FireFox Browser has been launched");
		}
		else {
			driver=new EdgeDriver();
			System.out.println("Edge Browser has been launched");
		}
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void tearDown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	@Test(priority = 0)
	public void wikiPediaTitleTest() {
		System.out.println(driver.getTitle());
	}
	@Test(priority = 1)
	public void totalLanguagesTest() {
	List<WebElement> totalLangauage=driver.findElements(By.tagName("option"));	
	System.out.println(totalLangauage.size());

	
	}
	@Test(priority = 2)
	public void dropDownTest() {
		WebElement lang=driver.findElement(By.id("searchLanguage"));
		Select sel=new Select(lang);
		sel.selectByVisibleText("English");
		System.out.println("User selected Winaray lanaguage");
	}
	@Test(priority = 3)
	public void listOfLangages() {
		//Long StrtTime=System.currentTimeMillis();
		List<WebElement> langues=driver.findElements(By.tagName("option"));
		for(int i=0;i<langues.size();i++) {
			System.out.println("Langauge name is "+langues.get(i).getText());
			System.out.println("Langauge First getAttribute name is "+langues.get(i).getAttribute("value"));
			System.out.println("Langauge Second getAttribute name is "+langues.get(i).getAttribute("lang"));
			System.out.println("*************************************************************");
			//Long EndTime=System.currentTimeMillis();
			//System.out.println("Total Time is "+(EndTime-StrtTime));
		}
	
	}
	@Test(priority = 4)
	public static void TotalLinksTest() {
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getAttribute("href"));
		}
	}
	@Test(priority = 5)
	public void totalLinkParticularSection() {
		WebElement parent_section=driver.findElement(By.xpath("//nav[@class='other-projects']/div"));
		List<WebElement> child_element=parent_section.findElements(By.tagName("a"));
		System.out.println("Total child elements in particular section is "+child_element.size());
		System.out.println("-------------------------------------------");
		
		for(int i=0;i<child_element.size();i++) {
			System.out.println("Name of child element is "+child_element.get(i).getText());
			System.out.println("The link of child element is "+child_element.get(i).getAttribute("href"));
			System.out.println("---------------------------------------");
		}
	}
	@Test(priority = 7)
	public void amazoneLinks() {
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement parent_section=driver.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[3]"));
		List<WebElement> child_ele=parent_section.findElements(By.tagName("a"));
		System.out.println("Total child elements in particular section is "+child_ele.size());
		System.out.println("-------------------------------------------");
		
		for(int i=0;i<child_ele.size();i++) {
			System.out.println("The name of child element is "+child_ele.get(i).getText());
			System.out.println("The link of child element is "+child_ele.get(i).getAttribute("href"));
		}
	}
	@Test(priority = 6)
	public void mainPageLinks() {
		WebElement parent_section=driver.findElement(By.xpath("//nav[@class='central-featured']/div"));
		List<WebElement> child_section=parent_section.findElements(By.tagName("a"));
		System.out.println("Total child elements links are "+child_section.size());
		System.out.println("******************************************");
		
		for(int i=0;i<child_section.size();i++) {
			System.out.println("Child name of element is "+child_section.get(i).getText());
			System.out.println("Child link is "+child_section.get(i).getAttribute("href"));
			System.out.println("##############################################");
		}
		
	}
}
