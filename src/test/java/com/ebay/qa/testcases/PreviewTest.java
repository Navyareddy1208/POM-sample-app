package com.ebay.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.OrderForms;
import com.ebay.qa.pages.preview;
import com.ebay.qa.utility.TestUtil;

public class PreviewTest extends TestBase{

	LoginPage loginPage;
	OrderForms orderforms ;
	preview preview;
	
	public PreviewTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		orderforms = loginPage.search();
		preview = orderforms.productresposive();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	

	/*
	 * @Test(priority = 1) public void previewTitleTest() { //form should navigate
	 * here-------- //div[@class='form-all'] String previewtitle =
	 * preview.validatepreviewpage(); Assert.assertEquals(previewtitle,
	 * "Responsive Product Order Form Template | JotForm"
	 * ,"preview title not matched");
	 * 
	 * }
	 */
	
	@Test(priority = 2)
	public void previewTest()
	{
		preview.filltheform();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		preview.select_list("active");
		preview.select_tshirt("active");
		preview.select_tshirtcolor("active");
		preview.select_tshirtqlty("active");
		orderforms = preview.submitform();
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

	
}
