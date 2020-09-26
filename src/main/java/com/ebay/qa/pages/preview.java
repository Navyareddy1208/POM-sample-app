package com.ebay.qa.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.utility.TestUtil;

public class preview extends TestBase {
	
	
	//@FindBy(xpath="//form[@name='form_42040294623952']//li[@id='id_2']//div[@id='cid_2']//input[@id='first_2']")
	@FindBy(xpath="//form[@name='form_42040294623952']//div[@id='cid_2']//input[@id='first_2']")
	WebElement firstname;

	@FindBy(xpath ="//input[@id='last_2']")
	WebElement lastname;

	@FindBy(xpath ="//input[@id='input_3']")
	WebElement email;

	@FindBy(xpath ="//input[@id='input_5_area']")
	WebElement areacode;

	@FindBy(xpath ="//input[@id='input_5_phone']")
	WebElement phonenum;

	@FindBy(xpath ="//input[@id='input_4_addr_line1']")
	WebElement streetaddr;

	@FindBy(xpath ="//input[@id='input_4_addr_line2']")
	WebElement streetaddline2;

	@FindBy(xpath ="//input[@id='input_4_city']")
	WebElement city;

	@FindBy(xpath ="//input[@id='input_4_state']")
	WebElement state;

	@FindBy(xpath ="//input[@id='input_4_postal']")
	WebElement postal;

	@FindBy(id ="input_4_country")
	WebElement country;

	public void select_list(String id) {
		Select countryDropdown = new Select(country);
		countryDropdown.selectByVisibleText(id);
	}

	@FindBy(id = "//input[@id='input_7_1001']")
	WebElement tshirt;

	public void select_tshirt(String id) {
		Select tshirtDropdown = new Select(tshirt);
		tshirtDropdown.selectByVisibleText(id);
	}

	@FindBy(id = "input_7_quantity_1002_0")
	WebElement quality;

	public void select_tshirtqlty(String id) {
		Select tshirtqltyDropdown = new Select(quality);
		tshirtqltyDropdown.selectByVisibleText(id);
	}

	@FindBy(id = "input_7_custom_1001_1")
	WebElement color;

	public void select_tshirtcolor(String id) {
		Select tshirtcolorDropdown = new Select(color);
		tshirtcolorDropdown.selectByVisibleText(id);
	}

	@FindBy(xpath = "//button[@id='input_13']")
	WebElement submitbutton;

	public preview() {
		PageFactory.initElements(driver, this);
	}

	public String validatepreviewpage()
	{
		//div[@class='form-all']
		//driver.navigate().to("https://www.jotform.com/form-templates/responsive-product-order-form");
		Set<String> windowhandler = driver.getWindowHandles();
		Iterator<String> it = windowhandler.iterator();
		String Parentwindow = it.next();
		System.out.println("parent window id....... "+Parentwindow);
		String childwindow = it.next();
		System.out.println("child window id....... "+childwindow);
		driver.switchTo().window(childwindow);
		System.out.println("child wondow title......" +driver.getTitle());
		String titleofpreviewpage = driver.getTitle();
		System.out.println("preview page title ...,,,,,,,," + titleofpreviewpage);
		return driver.getTitle();
	}
	public void filltheform() {

		//driver.navigate().to("https://www.jotform.com/form-templates/responsive-product-order-form");
		System.out.println("this is from fill the form method ");
		System.out.println("this is from fill the form method "+driver.getTitle());
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LODE_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		firstname.sendKeys("navya");
		System.out.println("this is from fill the form method ");
		lastname.sendKeys("reddy");
		email.sendKeys("navya@gmail.com");
		areacode.sendKeys("91");
		phonenum.sendKeys("7893951678");
		streetaddr.sendKeys("mig11");
		streetaddline2.sendKeys("kukatpally");
		city.sendKeys("hyd");
		state.sendKeys("telengana");
		postal.sendKeys("000000");

	}

	public OrderForms submitform() {
		submitbutton.click();
		return new OrderForms();
	}

}
