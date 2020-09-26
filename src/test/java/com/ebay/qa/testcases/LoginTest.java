package com.ebay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.OrderForms;
import com.ebay.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginpage;
	OrderForms orderforms ;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
	}
	
	
	@Test(priority = 1)
	public void loginpageTitleTest()
	{
		String title = loginpage.validateloginpage();
		Assert.assertEquals(title, "Registration Forms - Form Templates | JotForm");
		
	}
	
	@Test(priority = 2)
	public void LoginpageTest()
	{
		orderforms = loginpage.search();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
