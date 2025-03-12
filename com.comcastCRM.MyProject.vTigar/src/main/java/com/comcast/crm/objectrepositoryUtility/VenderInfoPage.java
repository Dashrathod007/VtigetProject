package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenderInfoPage {
	WebDriver driver;
	public VenderInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement headerInfo;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeaderInfo() {
		return headerInfo;
	}
	

}
