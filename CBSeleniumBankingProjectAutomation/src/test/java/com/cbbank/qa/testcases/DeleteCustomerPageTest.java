package com.cbbank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cbbank.qa.base.TestBase;
import com.cbbank.qa.pages.DeleteCustomerPage;
import com.cbbank.qa.pages.HomePage;
import com.cbbank.qa.pages.LoginPage;

public class DeleteCustomerPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public DeleteCustomerPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		deleteCustomerPage=homePage.clickDeleteCustomerBtn();
	}
	
	@Test(priority=0)
	public void deleteTheCustomer() {
		deleteCustomerPage.deleteCustomer(prop.getProperty("customerId"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
