package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class OrderForms extends TestBase{
	
	
	@FindBy(partialLinkText = "Responsive Product Order Form")
	WebElement productresponsive;

	
	public OrderForms() {
		PageFactory.initElements(driver, this);
	}
	
	public preview productresposive() {
		/*
		 * searchbar.sendKeys("Electronics"); searchbtn.click();
		 */
		productresponsive.click();
		return new preview();
	}

}
