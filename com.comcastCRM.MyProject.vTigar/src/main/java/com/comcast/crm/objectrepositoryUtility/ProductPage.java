package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);	
	}
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement CreateProduct;
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement SearchProdField;
	@FindBy(xpath = "//div[@id='basicsearchcolumns_real']")
	private WebElement ProductDropDown;
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement searchNowBtn;
	public WebElement getCreateProduct() {
		return CreateProduct;
	}
	public WebElement getSearchProdField() {
		return SearchProdField;
	}
	public WebElement getProductDropDown() {
		return ProductDropDown;
	}
	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}
	

}
