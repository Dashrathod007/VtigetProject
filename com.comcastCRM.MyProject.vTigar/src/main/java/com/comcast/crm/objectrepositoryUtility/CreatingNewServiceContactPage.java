package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.WebDriverUtility.WebDriverUtility;

public class CreatingNewServiceContactPage {
	WebDriver driver;
	public CreatingNewServiceContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subTextField;
	@FindBy(xpath = "//select[@name='sc_related_to_type']")
	private WebElement relatedToDropDown;
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement AddBtn;
	@FindBy(xpath = "//input[@id='jscal_field_start_date']")
	private WebElement startDate;
	@FindBy(xpath = "//input[@id='jscal_field_due_date']")
	private WebElement dueDate;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchOrgField;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement seachOrgbtn;
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchContactField;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement seachContbtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSubTextField() {
		return subTextField;
	}
	public WebElement getRelatedToDropDown() {
		return relatedToDropDown;
	}
	public WebElement getAddBtn() {
		return AddBtn;
	}
	public WebElement getStartDate() {
		return startDate;
	}
	public WebElement getDueDate() {
		return dueDate;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getSearchOrgField() {
		return searchOrgField;
	}
	public WebElement getSeachOrgbtn() {
		return seachOrgbtn;
	}
	public WebElement getSearchContactField() {
		return searchContactField;
	}
	public WebElement getSeachContbtn() {
		return seachContbtn;
	}
	public void SwitchToContactPopUp() {
		WebDriverUtility wlib=new WebDriverUtility();
		wlib.switchToWindowByURL(driver, "module=Contacts&action");
		return;
	}
	public void SwitchToOrgPopUp() {
		WebDriverUtility wlib=new WebDriverUtility();
		 wlib.switchToWindowByURL(driver, "module=Accounts&action");
	}


}
