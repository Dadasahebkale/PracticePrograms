package com.window;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleTest {

	public static void main(String[] args) {
	ChromeOptions ops=new ChromeOptions();
	ops.setBrowserVersion("117");
	WebDriver driver=new ChromeDriver(ops);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/browser-windows");
	//Launch the website "https://demoqa.com/browser-windows" and click on the windows - "windowbutton".
	//click on new tab window and will open child window
	driver.findElement(By.id("tabButton")).click();
	//String mainwindow = driver.getWindowHandle(): It stores parent window value in a unique identifier of string type.
	
	//get handles of windows
	String mainWindow=driver.getWindowHandle();
	//Set<String> s = driver.getWindowHandles(): All child windows are stored in a set of strings.
	Set<String>allWindows=driver.getWindowHandles();
	//Iterator<String> i = s.iterator() : Here we will iterate through all child windows.
	Iterator<String> itr=allWindows.iterator();
	
	//Here we will check if child window has other child windows and will fetch the heading of the child window
    
	while(itr.hasNext()) {
		String childWindow=itr.next();
		//if (!MainWindow.equalsIgnoreCase(ChildWindow)) : Now check them by comparing the main window with the child windows.
		if(!mainWindow.equalsIgnoreCase(childWindow)) {
			//driver.switchTo().window (ChildWindow): Switch to the child window and read the heading
			driver.switchTo().window(childWindow);
			//WebElement text = driver.findElement(By.id("sampleHeading")): Find the element and store in a web element through which we will get the text of heading using gettext() method.
			
			WebElement text=driver.findElement(By.id("sampleHeading"));
			System.out.println("Child window text" +text.getText());
			
			//switch back to the main window
			driver.switchTo().window(mainWindow);
			
			//clicking on the new window tab
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,300)");
			driver.findElement(By.id("windowButton")).click();
			driver.switchTo().window(childWindow);
		String newwindowText=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("New window text "+newwindowText);
			
		
		}
	}
	driver.quit();

	}

}
/*Launch the website "https://demoqa.com/browser-windows" and click on the windows - "windowbutton".
String mainwindow = driver.getWindowHandle(): It stores parent window value in a unique identifier of string type.
Set<String> s = driver.getWindowHandles(): All child windows are stored in a set of strings.
Iterator<String> i = s.iterator() : Here we will iterate through all child windows.
if (!MainWindow.equalsIgnoreCase(ChildWindow)) : Now check them by comparing the main window with the child windows.
driver.switchTo().window (ChildWindow): Switch to the child window and read the heading.
WebElement text = driver.findElement(By.id("sampleHeading")): Find the element and store in a web element through which we will get the text of heading using gettext() method.*/