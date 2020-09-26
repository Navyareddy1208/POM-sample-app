package com.ebay.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.OrderForms;
import com.ebay.qa.pages.preview;

public class OrderFormTest extends TestBase{

	LoginPage loginPage;
	OrderForms orderforms ;
	preview preview;

	public OrderFormTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		orderforms = loginPage.search();
	}
	
	
	
	/*
	 * @Test(priority = 1) public void OrderTitleTest() { String title =
	 * orderforms.validateOrderpage(); Assert.assertEquals(title,
	 * "700+ Order Forms - Form Templates | JotForm");
	 * 
	 * }
	 */
	
	@Test(priority = 1)
	public void orderFormTest()
	{
		preview = orderforms.productresposive();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}


	
	
	
	
	
}
