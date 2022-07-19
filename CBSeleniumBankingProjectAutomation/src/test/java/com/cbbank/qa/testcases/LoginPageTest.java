package com.cbbank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cbbank.qa.base.TestBase;
import com.cbbank.qa.pages.HomePage;
import com.cbbank.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	//This line will be pushed to github

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 0)
	public void validateLoginTitle() {
		Assert.assertEquals(loginPage.validateLoginPageTitle(), "Guru99 Bank Home Page");
	}

	@Test(priority = 1)
	public void validateLoginLogo() {
		Assert.assertTrue(loginPage.validateLoginPageLogo());
	}

	@Test(priority = 2)
	public void loginToApp() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
