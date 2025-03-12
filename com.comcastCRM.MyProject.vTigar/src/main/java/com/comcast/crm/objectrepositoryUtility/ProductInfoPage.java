package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
	WebDriver driver;
	public ProductInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement HeaderInfo;
	@FindBy(xpath = "id=\"dtlview_Product Active\"")
	private WebElement ProductActive;
	@FindBy(xpath = "//span[@id='dtlview_Sales Start Date']")
	private WebElement SalesStartDate;
	@FindBy(xpath = "//span[@id='dtlview_Sales End Date']")
	private WebElement SalesEndDate;
	@FindBy(xpath = "//span[@id='dtlview_Product Category']")
	private WebElement ProductCategory;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeaderInfo() {
		return HeaderInfo;
	}
	public WebElement getProductActive() {
		return ProductActive;
	}
	public WebElement getSalesStartDate() {
		return SalesStartDate;
	}
	public WebElement getSalesEndDate() {
		return SalesEndDate;
	}
	public WebElement getProductCategory() {
		return ProductCategory;
	}
	

}
