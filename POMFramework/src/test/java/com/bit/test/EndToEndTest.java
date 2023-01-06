package com.bit.test;

import org.junit.Test;

import pages.HomePage;
import pages.JewelryPage;
import pages.ProductDetailsPage;
import pages.ShirtPage;

public class EndToEndTest extends BaseTest{
	
	HomePage homePage;
	ShirtPage shirtPage;
	ProductDetailsPage pDetailsPage;
	JewelryPage jewelryPage;
	
	@Test
	public void buyAShirtWithPaypalSameBillingAndAddress() {
		homePage = new HomePage(driver);
		homePage.hoverOverOnMenMenu();
		shirtPage = homePage.clickOnShirtSubCatagory();
		pDetailsPage = shirtPage.clickOnAnyShirtProduct();
	}
	
	@Test
	public void BuyAJewelry() {
		homePage = new HomePage(driver);
		homePage.hovenOverOnWomenMenu();
		jewelryPage = homePage.clickOnJewelrySubCatagory();
	}
	

}
