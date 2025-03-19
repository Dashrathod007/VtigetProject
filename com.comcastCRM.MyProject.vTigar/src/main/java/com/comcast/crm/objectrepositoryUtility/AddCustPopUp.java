package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustPopUp {
	WebDriver driver;

	public AddCustPopUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement custSearchTextField;
	@FindBy(xpath = "//select[@name='search_field'")
	private WebElement searchDropDown;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchNowBtn;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCustSearchTextField() {
		return custSearchTextField;
	}
	public WebElement getSearchDropDown() {
		return searchDropDown;
	}
	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}
}
