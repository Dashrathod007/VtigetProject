package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewProductPage {
	WebDriver driver;
	public CreatingNewProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);	
	}
	@FindBy(xpath = "//input[@name='productname']")
	private WebElement ProductNameTextField;
	@FindBy(xpath = "//input[@name='discontinued']")
	private WebElement productActiveCheckBox;
	@FindBy(xpath = "//input[@name='sales_start_date']")
	private WebElement SalesStartDate;
	@FindBy(xpath = "//input[@name='sales_end_date']")
	private WebElement SalesEndDate;
	@FindBy(xpath = "//select[@name='productcategory']")
	private WebElement ProductCategoryDropDown;
	@FindBy(xpath = "//input[@name='assigntype']")
	private WebElement HandlerUserRadioBtn;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveBtn;
	@FindBy(xpath = "//input[@name='unit_price']")
	private WebElement productPrice;
	@FindBy(xpath = "//input[@name='qtyinstock']")
	private WebElement productStock;
	@FindBy(xpath = "//select[@name='manufacturer']")
	private WebElement manufacture;
	
	
	public WebElement getProductPrice() {
		return productPrice;
	}
	public WebElement getProductStock() {
		return productStock;
	}
	public WebElement getManufacture() {
		return manufacture;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getProductNameTextField() {
		return ProductNameTextField;
	}
	public WebElement getProductActiveCheckBox() {
		return productActiveCheckBox;
	}
	public WebElement getSalesStartDate() {
		return SalesStartDate;
	}
	public WebElement getSalesEndDate() {
		return SalesEndDate;
	}
	public WebElement getProductCategoryDropDown() {
		return ProductCategoryDropDown;
	}
	public WebElement getHandlerUserRadioBtn() {
		return HandlerUserRadioBtn;
	}
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	

}
