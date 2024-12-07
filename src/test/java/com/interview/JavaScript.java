package com.interview;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {
	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--incognito");
		ops.setBrowserVersion("118");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.freecrm.com");
		WebElement services=driver.findElement(By.xpath("//section/div[@class='shell']/h3"));
		scrollIntoViewByJs(services);
		WebElement startbutton = driver.findElement(By.xpath("//a/span[text()='Start Here']"));
		flash(startbutton);
		drawBorder(startbutton);
		startbutton.click();
		driver.findElement(By.name("email")).sendKeys("supermantemp10@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ganesh@01");
		WebElement button = driver.findElement(By.xpath("//input[@name='password']/following::div[text()='Login']"));
		//scrollPageDown();
		// get page inner text
		System.out.println(getPageInnerText());

		flash(button);
		drawBorder(button);
		takeScreenShot();
		generateAlert("There is an issue with login button on the Login page");
		driver.switchTo().alert().accept();
		// button.click();
		clickElementByJs(button);
		// get title of the page
		System.out.println(getTitleByJs());

		refreshBrowserByJs();
		scrollPageDown();
		tearDown();

	}

	public static void flash(WebElement element) {
		// JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void drawBorder(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void takeScreenShot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,
					new File("D:\\CucumberLatest\\automation\\src\\test\\resources\\screenShots\\element.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void generateAlert(String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementByJs(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", element);
	}

	public static void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

	public static void refreshBrowserByJs() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String getTitleByJs() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String innerText = js.executeScript("return document.documentElement.innerText;").toString();
		return innerText;
	}
	public static void scrollPageDown() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollIntoViewByJs(WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
