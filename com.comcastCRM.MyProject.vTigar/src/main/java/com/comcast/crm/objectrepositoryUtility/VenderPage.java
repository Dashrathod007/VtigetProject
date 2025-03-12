package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenderPage {
	WebDriver driver;
	public VenderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath  = "//img[@title='Create Vendor...']")
	private WebElement createVender;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreateVender() {
		return createVender;
	}
	
	

}
