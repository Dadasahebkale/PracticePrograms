package com.upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		ChromeOptions ops=new ChromeOptions();
		ops.setBrowserVersion("118");
		WebDriver driver=new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/mnjuser/homepage");
		//driver.findElement(By.xpath("//a[text()='Login']"));
		
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("dadasahebkale@yahoo.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Ganesh@01");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		driver.findElement(By.partialLinkText("profile")).click();
		//driver.findElement(By.xpath("//a[text()='Update']")).click();
		WebElement path=driver.findElement(By.xpath("//input[@value='Update resume']"));
		path.click();
		path.sendKeys("D:\\Resume\\Oct\\Dadasaheb Kale_SQA.docx");
	//	"D:\Resume\Sept'23\Dadasaheb Kale_Automation Tester.docx"
//		Actions a=new Actions(driver);
//		a.moveToElement(path).click().perform();
//		
//		Robot r=new Robot();
//		r.delay(2000);
//		StringSelection s=new StringSelection("D:\\Resume\\Oct\\Dadasaheb Kale_SQA.docx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		//		path.click();
////		path.sendKeys("");
////			//	String p="D:\\Resume\\Oct\\Dadasaheb Kale_SQA.docx";
		System.out.println("Resume has been sucussfully uploaded");

	}

}
