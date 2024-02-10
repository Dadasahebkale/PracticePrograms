package com.dktech;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoopingThroughTableElements {
	// Declaring variables
			private WebDriver driver;
			private String baseUrl;

			@BeforeTest
			public void setUp() throws Exception {
				// Selenium version 3 beta releases require system property set up
				//System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\"Selenium\\geckodriver-v0.10.0-win64\\geckodriver.exe");
				// Create a new instance for the class FirefoxDriver
				// that implements WebDriver interface
				driver = new ChromeDriver();
				// Implicit wait for 5 seconds
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// Assign the URL to be invoked to a String variable
				baseUrl = " https://chandanachaitanya.github.io/selenium-practice-site/";
			}

			@Test
			public void testPageTitle() throws Exception {
				// Open baseUrl in Firefox browser window
				driver.get(baseUrl);

				// Locate 'Books & Authors' table using id
				WebElement BooksTable = driver.findElement(By.id("BooksAuthorsTable"));
				//Get all web elements by tag name 'tr'
			
				java.util.List<WebElement> rowVals = BooksTable.findElements(By.tagName("tr"));
				
				//Get number of rows and columns
				//using absoulute xpath
				int rowNum = driver.findElements(By.xpath("/html/body/form/div[5]/div/div/table/tbody/tr")).size();
				//using relative xpath
				int colNum = driver.findElements(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr[1]/th")).size();
				System.out.println("Total number of rows = " + rowNum);
				System.out.println("Total number of columns = " + colNum);
				
				//Get column header values from first row
				java.util.List<WebElement> colHeader = rowVals.get(0).findElements(By.tagName("th"));
				//Loop through the header values and print them to console
				System.out.println("Header values:");
				for(int i=0; i<colHeader.size(); i++){
					System.out.println(colHeader.get(i).getText());
				}
				System.out.println("---------------");
				//Loop through the remaining rows
				for(int i=1; i<rowNum; i++){
					//Get each row's column values by tag name
					java.util.List<WebElement> colVals = rowVals.get(i).findElements(By.tagName("td"));
					//Loop through each column
					for(int j=0; j<colNum; j++){
						//Print the coulumn values to console
						System.out.println(colVals.get(j).getText());
					}
					//Just a separator for each row
					System.out.println("---------------");
				}			
				
				//Printing table contents to console for fixed row and column numbers
				for(int i=2; i<=6; i++){
					for(int j=1; j<=4; j++){
						System.out.print(driver.findElement(By.
								xpath("//table[@id='BooksAuthorsTable']/tbody/tr[" + i +"]/td[" + j + "]")).getText() + "\t");
					}
					System.out.println("");
				}
				
			} //End of @Test

			@AfterTest
			public void tearDown() throws Exception {
				// Close the Firefox browser
				driver.close();
			}

}
