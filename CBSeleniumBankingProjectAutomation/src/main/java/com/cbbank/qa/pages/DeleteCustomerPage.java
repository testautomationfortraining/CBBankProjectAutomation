package com.cbbank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbbank.qa.base.TestBase;

public class DeleteCustomerPage extends TestBase {
	
	//xpaths
	@FindBy(xpath="//input[@name='cusid']")
	WebElement customerIdTextBox;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	WebElement submitBtn;
	
	//initialize
	public DeleteCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public void deleteCustomer(String custId) {
		customerIdTextBox.sendKeys(custId);
		submitBtn.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}

}
