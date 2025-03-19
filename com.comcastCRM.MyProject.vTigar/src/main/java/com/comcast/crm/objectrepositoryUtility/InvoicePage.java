package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	WebDriver driver;

	public InvoicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
  @FindBy(xpath = "//img[@alt='Create Invoice...']")
  private WebElement addInvoiceBtn;

public WebDriver getDriver() {
	return driver;
}
public WebElement getAddInvoiceBtn() {
	return addInvoiceBtn;
}

}
