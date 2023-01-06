package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumHelper;

public class ShirtPage {
	WebDriver driver;
	
	@FindBy(xpath = "") WebElement redShirt;
	
	public ShirtPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductDetailsPage clickOnAnyShirtProduct() {
		SeleniumHelper.clickOnElement(redShirt);
		
		return new ProductDetailsPage();
	}

}
