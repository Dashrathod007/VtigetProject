package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceBookPage {
	WebDriver driver;
	public PriceBookPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@alt='Create Price Book...']")
	private WebElement createNewPriceBook;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreateNewPriceBook() {
		return createNewPriceBook;
	}
	 

}
