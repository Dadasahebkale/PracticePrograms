package com.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest {
	public static WebDriver driver;
	public static String url = "https://www.w3schools.com/html/html_tables.asp";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Chromedriver//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		System.out.println(getRowandCountDetails("Germany"));
		driver.quit();

	}

	public static boolean getRowandCountDetails(String name) {
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		boolean flag = false;
		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				String actualValue = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + (i + 1) + "]/td[" + j + "]"))
						.getText();
				if (actualValue.equals(name)) {
					flag = true;
					System.out.println(i + " : " + j);
					break;
				}

			}
		}
		if (flag) {
			return true;
		}
		
		return flag;
		
	}
}
