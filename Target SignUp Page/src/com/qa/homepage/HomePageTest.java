package com.qa.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		
		driver = new ChromeDriver();
//		 driver = new FirefoxDriver();
		
		driver.get("https://www.target.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Kids Shoes");
		
		WebElement clickSignIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
		
		clickSignIn.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()=\"Create Account\"]")).click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement fName = driver.findElement(By.id("firstname"));
		WebElement lName = driver.findElement(By.name("lastnamecreateaccount"));
		WebElement phone = driver.findElement(By.cssSelector("input#phone"));
		WebElement cratePW = driver.findElement(By.name("passwordcreateaccount"));
		

		
		email.sendKeys("sgfyst@gmail.com");
		fName.sendKeys("Sadikur");
		lName.sendKeys("Rahman");
		phone.sendKeys("0171743256");
		cratePW.sendKeys("shuh$%127");
		
		driver.findElement(By.cssSelector("button#createAccount")).click();
		
		driver.close();
		
//		driver.quit();
		
		
		
		
		
	}

}
