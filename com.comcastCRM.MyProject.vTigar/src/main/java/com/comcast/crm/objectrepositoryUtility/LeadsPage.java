package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	WebDriver driver;
	public LeadsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement CreateLeadsBtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreateLeadsBtn() {
		return CreateLeadsBtn;
	}
	

}
