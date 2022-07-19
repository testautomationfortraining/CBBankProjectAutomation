package com.cbbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbbank.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//xpaths
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomerBtn;
	
	@FindBy(xpath="//span[text()='Close']")
	WebElement closeBtn;
	
	//initialize
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public DeleteCustomerPage clickDeleteCustomerBtn() {
		deleteCustomerBtn.click();
		if(closeBtn.isDisplayed()) {
			closeBtn.click();
		}
		return new DeleteCustomerPage();
	}
}
