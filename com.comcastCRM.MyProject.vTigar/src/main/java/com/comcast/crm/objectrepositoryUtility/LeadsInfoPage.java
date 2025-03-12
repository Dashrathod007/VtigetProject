package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsInfoPage {
	WebDriver driver;
	public  LeadsInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerTextInfo;
	@FindBy(xpath = "//span[@id='dtlview_First Name']")
	private WebElement firstNameInfo;
	@FindBy(xpath = "//span[@id='dtlview_Last Name']")
	private WebElement lastNameInfo;
	@FindBy(xpath = "//span[@id='dtlview_Company']")
	private WebElement companyNameInfo;
	@FindBy(xpath = "//span[@id='dtlview_Lead Source']")
	private WebElement leadSourceInfo;
	@FindBy(xpath = "//span[@id='dtlview_Industry']")
	private WebElement IndustryInfo;
	@FindBy(xpath = "//span[@id='dtlview_Phone']")
	private WebElement phoneInfo;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeaderTextInfo() {
		return headerTextInfo;
	}
	public WebElement getFirstNameInfo() {
		return firstNameInfo;
	}
	public WebElement getLastNameInfo() {
		return lastNameInfo;
	}
	public WebElement getCompanyNameInfo() {
		return companyNameInfo;
	}
	public WebElement getLeadSourceInfo() {
		return leadSourceInfo;
	}
	public WebElement getIndustryInfo() {
		return IndustryInfo;
	}
	public WebElement getPhoneInfo() {
		return phoneInfo;
	}

}
