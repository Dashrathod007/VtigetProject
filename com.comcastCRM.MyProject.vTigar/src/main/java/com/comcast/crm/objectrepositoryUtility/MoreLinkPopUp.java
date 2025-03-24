package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoreLinkPopUp {
	WebDriver driver;
	public MoreLinkPopUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath = "//a[@href='index.php?module=Vendors&action=index']")
	private WebElement venders;
	@FindBy(xpath = "//a[@href='index.php?module=PurchaseOrder&action=index']")
	private WebElement purchaseOrder;
	@FindBy(xpath = "//a[@href='index.php?module=Invoice&action=index']")
	private WebElement invoice;
	@FindBy(xpath = "//a[@href='index.php?module=SalesOrder&action=index']")
	private WebElement salesOrder;
	@FindBy(xpath = "//a[@href='index.php?module=PriceBook&action=index']")
	private WebElement priceBook;
	@FindBy(xpath = "//a[@name='Service Contracts']")
	private WebElement createServiceContract;
	public WebElement getCreateServiceContract() {
		return createServiceContract;
	}
	public WebElement getPriceBook() {
		return priceBook;
	}
	public void setPriceBook(WebElement priceBook) {
		this.priceBook = priceBook;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getVenders() {
		return venders;
	}
	public WebElement getPurchaseOrder() {
		return purchaseOrder;
	}
	public WebElement getInvoice() {
		return invoice;
	}
	public WebElement getSalesOrder() {
		return salesOrder;
	}

}
