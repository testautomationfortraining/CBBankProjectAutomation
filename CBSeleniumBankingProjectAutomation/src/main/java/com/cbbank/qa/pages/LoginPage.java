package com.cbbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbbank.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//xpaths
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement logo;
	
	//initialize the xpaths
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLoginPageLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		btnLogin.click();
		return new HomePage();
	}

}
