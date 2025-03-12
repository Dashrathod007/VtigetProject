package com.comcast.crm.objectrepositoryUtility;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesOrderPage {
	WebDriver driver;
	public SalesOrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//img[@alt='Create Sales Order...']")
	private WebElement createSalesOrder;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreateSalesOrder() {
		return createSalesOrder;
	}

}
