package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewInvoice {
	WebDriver driver;

	public CreatingNewInvoice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subjectTxtField;
	@FindBy(xpath = "//input[@name='contact_name']")
	private WebElement contactName;
	@FindBy(xpath = "(//img[@src=\"themes/softed/images/select.gif\"])[2]")
	private WebElement contactAddBtn;
	@FindBy(xpath = "(//img[@src=\"themes/softed/images/select.gif\"])[1]")
	private WebElement salesOrderAddBtn;
	@FindBy(xpath = "(//img[@src=\"themes/softed/images/select.gif\"])[3]")
	private WebElement organisationAddBtn;
	@FindBy(xpath = "//input[@name='duedate']")
	private WebElement DueDate;
	@FindBy(xpath = "//input[@name='assigntype']")
	private WebElement assignedRadioBtn;
	@FindBy(xpath = "//input[@name='salesorder_name']")
	private WebElement SalesOrder;
	@FindBy(xpath = "//input[@name='bill_street']")
	private WebElement billingAddressTxtField;
	@FindBy(xpath = "//input[@name='ship_street']")
	private WebElement shippingAddressTxtField;
	@FindBy(xpath = "//input[@onclick='return copyAddressLeft(EditView)']")
	private WebElement copyShipingaddressRadio;
	@FindBy(xpath = "//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement copyBillingaddressRadio;
	@FindBy(xpath = "//img[@id='searchIcon1']")
	private WebElement addItem;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	@FindBy(xpath = "//input[@name='customerno']")
	private WebElement addCustNo;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getaddCustNo() {
		return addCustNo;
	}

	public WebElement getSubjectTxtField() {
		return subjectTxtField;
	}

	public WebElement getContactName() {
		return contactName;
	}

	public WebElement getContactAddBtn() {
		return contactAddBtn;
	}

	public WebElement getSalesOrderAddBtn() {
		return salesOrderAddBtn;
	}

	public WebElement getOrganisationAddBtn() {
		return organisationAddBtn;
	}

	public WebElement getDueDate() {
		return DueDate;
	}

	public WebElement getAssignedRadioBtn() {
		return assignedRadioBtn;
	}

	public WebElement getSalesOrder() {
		return SalesOrder;
	}

	public WebElement getBillingAddressTxtField() {
		return billingAddressTxtField;
	}

	public WebElement getShippingAddressTxtField() {
		return shippingAddressTxtField;
	}

	public WebElement getCopyShipingaddressRadio() {
		return copyShipingaddressRadio;
	}

	public WebElement getCopyBillingaddressRadio() {
		return copyBillingaddressRadio;
	}

	public WebElement getAddItem() {
		return addItem;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
