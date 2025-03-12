package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewVender {
	WebDriver driver;
	public CreatingNewVender(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath  = "//input[@name='vendorname']")
	private WebElement venderNameTextField;
	@FindBy(xpath  = "//input[@name='email']")
	private WebElement emailTextField;
	@FindBy(xpath  = "//input[@name='phone']")
	private WebElement phoneTextField;
	@FindBy(xpath  = "(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement saveButton;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getVenderNameTextField() {
		return venderNameTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPhoneTextField() {
		return phoneTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	

}
