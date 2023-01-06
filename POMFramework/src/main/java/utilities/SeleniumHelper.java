package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumHelper {
	
	public static void hoverOverOnElement(WebDriver driver, WebElement element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}

}
