package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewPriceBookPage {
	WebDriver driver;
	public CreatingNewPriceBookPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@name='bookname']")
	private WebElement priceBookName;
	@FindBy(xpath = "//input[@name='active']")
	private WebElement activeCheckBox;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getPriceBookName() {
		return priceBookName;
	}
	public WebElement getActiveCheckBox() {
		return activeCheckBox;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
}
