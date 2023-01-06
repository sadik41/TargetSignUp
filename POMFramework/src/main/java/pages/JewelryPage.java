package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumHelper;

public class JewelryPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "xpath of jewelry") WebElement ringJewelry;
	
	public JewelryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ProductDetailsPage clickOnRingJewelry() {
		
		SeleniumHelper.clickOnElement(ringJewelry);
		
		return new ProductDetailsPage();
	}

}
