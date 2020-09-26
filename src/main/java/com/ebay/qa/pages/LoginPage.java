package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class LoginPage extends TestBase{

	//page factory -object repoditory
	
	/*
	 * @FindBy(name="username")
	 *  WebElement username;
	 * 
	 * @FindBy(name="password")
	 *  WebElement password;
	 */
	
	 @FindBy(xpath="//input[@id='gh-ac']" )
	   WebElement searchbar;
	 
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement searchbtn;
	
	@FindBy(linkText = "Registration Forms")
	WebElement registrationform;
	@FindBy(linkText = "Order Forms")
	WebElement Orderforms;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateloginpage()
	{
		return driver.getTitle();
	}
	
	public OrderForms search() {
		/*
		 * searchbar.sendKeys("Electronics"); searchbtn.click();
		 */
		Orderforms.click();
		return new OrderForms();
	}
}
