package com.comcast.crm.objectrepositoryUtility;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewSalesOrderPage {
	WebDriver driver;
	public CreatingNewSalesOrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTextField;
	@FindBy(xpath = "//input[@name='customerno']")
	private WebElement custNo;
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[3]")
	private WebElement addContactName;
	@FindBy(xpath = "//input[@name='assigntype']")
	private WebElement assignRadioBtn;
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[4]")
	private WebElement addOrganisation;
	@FindBy(xpath = "//input[@id='jscal_field_end_period']")
	private WebElement endPeriodDate;
	@FindBy(xpath = "//input[@name='enable_recurring']")
	private WebElement recurringCheckbox;
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billAddressTextField;
	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shipAddressTextField;
	@FindBy(xpath = "//input[@onclick='return copyAddressLeft(EditView)']")
	private WebElement CopyShippingAddressRadioBtn;
	@FindBy(xpath = "//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement CopyBillingAddressRadioBtn;
	@FindBy(xpath = "//img[@title='Products']")
	private WebElement SearchProductTextField;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchNowBtn;
	@FindBy(xpath = "//input[@name='qty1']")
	private WebElement productQuntity;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	@FindBy(xpath = "//img[@title='Products']")
	private WebElement AddItemBtn;
	public WebElement getAddItemBtn() {
		return AddItemBtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSubjectTextField() {
		return subjectTextField;
	}
	public WebElement getCustNo() {
		return custNo;
	}
	public WebElement getAddContactName() {
		return addContactName;
	}
	public WebElement getAssignRadioBtn() {
		return assignRadioBtn;
	}
	public WebElement getAddOrganisation() {
		return addOrganisation;
	}
	public WebElement getEndPeriodDate() {
		return endPeriodDate;
	}
	public WebElement getRecurringCheckbox() {
		return recurringCheckbox;
	}
	public WebElement getBillAddressTextField() {
		return billAddressTextField;
	}
	public WebElement getShipAddressTextField() {
		return shipAddressTextField;
	}
	public WebElement getCopyShippingAddressRadioBtn() {
		return CopyShippingAddressRadioBtn;
	}
	public WebElement getCopyBillingAddressRadioBtn() {
		return CopyBillingAddressRadioBtn;
	}
	public WebElement getSearchProductTextField() {
		return SearchProductTextField;
	}
	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}
	public WebElement getProductQuntity() {
		return productQuntity;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	
	

}
