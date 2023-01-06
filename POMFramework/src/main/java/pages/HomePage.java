package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumHelper;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath = "xpath of men menu") 
	WebElement menMenuBar;
	
	@FindBy(xpath = "xpath of Shirt catagory") 
	WebElement shirtSubMenu;
	
	@FindBy(xpath = "xpath of women menu") 
	WebElement womenMenuBar;
	
	@FindBy(xpath = "xpath of jewelrt sub menu") 
	WebElement jewelrySubMenu;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOverOnMenMenu() {
		SeleniumHelper.hoverOverOnElement(driver, menMenuBar);

}
	
	public ShirtPage clickOnShirtSubCatagory() {
		SeleniumHelper.clickOnElement(menMenuBar);
		
		return new ShirtPage(driver);
	}
	
	public void hovenOverOnWomenMenu() {
		SeleniumHelper.hoverOverOnElement(driver, womenMenuBar);
	}
	
	public JewelryPage clickOnJewelrySubCatagory() {
		SeleniumHelper.clickOnElement(jewelrySubMenu);
		
		return new JewelryPage(driver);
	}
	
}
