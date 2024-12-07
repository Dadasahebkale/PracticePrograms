package com.exception;

public class ExceptionNotes {

//	Handling overlapping elements in Selenium when automating test cases can be tricky, especially if exceptions like `ElementClickInterceptedException` or `ElementNotInteractableException` arise. These issues occur when one element is blocking access to the element you're trying to interact with.
//	Here are a few strategies to handle overlapping elements in Selenium with Java:
//	1. **Use JavaScriptExecutor**:
//	   Sometimes the WebDriver is unable to click on an element due to an overlap, but JavaScript can click the element directly. Here's how to do it:
//	   WebElement element = driver.findElement(By.id("element-id"));
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//	   js.executeScript("arguments[0].click();", element);
//	### 2. **Scroll to the Element**:
//	   If the element is not in view, scrolling into view can often solve the problem.
//	   WebElement element = driver.findElement(By.id("element-id"));
//	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//	   element.click();
//
//	### 3. **Wait Until the Element is Clickable**:
//	   If there’s a loading element or animation on top of your target element, try adding an explicit wait to ensure the element becomes clickable.
//	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("element-id")));
//	   element.click();
//
//	### 4. **Handle Overlapping Popups/Ads**:*/
//	   If a popup or ad overlaps your element, consider closing or handling the popup first.
//	   - **Detect and close popups**:
//	     try {
//	         WebElement closeButton = driver.findElement(By.id("popup-close-button"));
//	         closeButton.click();
//	     } catch (NoSuchElementException e) {
//	         // Handle if popup is not present
//	     }
//
//	### 5. **Action Class for Precision**:
//	   If clicking on a certain coordinate or hovering before clicking helps avoid the overlap:
//	   Actions actions = new Actions(driver);
//	   WebElement element = driver.findElement(By.id("element-id"));
//	   actions.moveToElement(element).click().perform();
//	  
//	### 6. **Check for Element Visibility and Interactions**:
//	   Use `isDisplayed()` or `isEnabled()` to ensure the element is in a state that allows interaction.
//	 
//	   WebElement element = driver.findElement(By.id("element-id"));
//	   if (element.isDisplayed() && element.isEnabled()) {
//	       element.click();
//	   }
//
//	### 7. **Handle Exceptions**:
//	   Catch exceptions like `ElementClickInterceptedException` and retry the action after waiting or scrolling.
//	   try {
//	       WebElement element = driver.findElement(By.id("element-id"));
//	       element.click();
//	   } catch (ElementClickInterceptedException e) {
//	       // Retry with a different strategy
//	       JavascriptExecutor js = (JavascriptExecutor) driver;
//	       js.executeScript("arguments[0].click();", element);
//	   }
//
//	### 8. **Minimize Browser Window**:
//	   Sometimes reducing the browser window size can avoid unwanted overlaps.
//	   driver.manage().window().setSize(new Dimension(800, 600));
//	### Key Exceptions to Handle:
//	- **ElementClickInterceptedException**: Raised when another element (like a popup or overlay) is blocking the desired element.
//	- **ElementNotInteractableException**: Raised when an element is present in the DOM but cannot be interacted with (possibly due to styling issues).
//	- **NoSuchElementException**: Raised when the element cannot be found in the DOM.
//	These methods should help you overcome most overlapping element issues in Selenium Java while automating test cases.

}
