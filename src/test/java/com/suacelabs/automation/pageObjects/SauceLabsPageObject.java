package com.suacelabs.automation.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.suacelabs.automation.utils.BasePage;

public class SauceLabsPageObject  extends BasePage{
	
	public SauceLabsPageObject() {
		PageFactory.initElements(driver, this);
	}
	

	
	/*Locators*/
	
	final static String SEARCH_BAR = "//button[@title='Search']";
	final static String ROBOT = "";
	
	
	/*FindBy*/
	
	@FindBy(how = How.XPATH, using = SEARCH_BAR)
	public static WebElement search;
	
	/*Methods*/
	
	
}
