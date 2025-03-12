package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage {
	WebDriver driver;
	public CreateNewLeadsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
 @FindBy(xpath ="//input[@name='firstname']")
	private WebElement FirstNameTextField;
 @FindBy(xpath ="//input[@name='lastname']")
 private WebElement LastNameTextField;
 @FindBy(xpath = "//input[@name='company']")
 private WebElement companyNameTextField;
 @FindBy(xpath = "//select[@name='leadsource']")
 private WebElement leadSourceDropDown;
 @FindBy(xpath = "//select[@name='industry']")
 private WebElement industryDropDown;
 @FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
 private WebElement saveButton;
 @FindBy(xpath = "//input[@name='phone']")
 private WebElement phoneTextField;
public WebElement getPhoneTextField() {
	return phoneTextField;
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getFirstNameTextField() {
	return FirstNameTextField;
}
public WebElement getLastNameTextField() {
	return LastNameTextField;
}
public WebElement getCompanyNameTextField() {
	return companyNameTextField;
}
public WebElement getLeadSourceDropDown() {
	return leadSourceDropDown;
}
public WebElement getIndustryDropDown() {
	return industryDropDown;
}
public WebElement getSaveButton() {
	return saveButton;
}
 
 }
