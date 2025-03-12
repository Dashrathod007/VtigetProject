package CreateProduct;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.generic.WebDriverUtility.UtilityClassObject;
import com.comcast.crm.objectrepositoryUtility.ContactPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewContactPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewProductPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewVender;
import com.comcast.crm.objectrepositoryUtility.HomePage;
import com.comcast.crm.objectrepositoryUtility.MoreLinkPopUp;
import com.comcast.crm.objectrepositoryUtility.OrganisationInfoPAge;
import com.comcast.crm.objectrepositoryUtility.OrganisationPage;
import com.comcast.crm.objectrepositoryUtility.ProductPage;
import com.comcast.crm.objectrepositoryUtility.VenderInfoPage;
import com.comcast.crm.objectrepositoryUtility.VenderPage;
import com.comcast.crm.objectrepositoryUtility.creatingNewOrganisationPage;

@Listeners(com.comcast.crm.listenerUtility.ListenerImplementationClass.class)

public class CraeteProductTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createProduct() throws Exception {
		UtilityClassObject.getTest().log(Status.INFO, "Read The Data From Excel");
		String product = elib.getDatafromExcel("Product", 1, 2) + jlib.getRandomNumber();
		String productcategory = elib.getDatafromExcel("Product", 1, 3);
		String vendorName = elib.getDatafromExcel("Vendor", 1, 2);
		String vendorMailId = elib.getDatafromExcel("Vendor", 1, 3);
		String vendorPhone = elib.getDatafromExcel("Vendor", 1, 4);

		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Venders Page");
		HomePage hp = new HomePage(driver);
		WebElement ele1 = hp.getMoreLink();
		wlib.mouseMoveOnElement(driver, ele1);
		MoreLinkPopUp mp = new MoreLinkPopUp(driver);
		mp.getVenders().click();
		UtilityClassObject.getTest().log(Status.INFO, "Create New Vendor");
		VenderPage vp = new VenderPage(driver);
		vp.getCreateVender().click();
		CreatingNewVender cnv = new CreatingNewVender(driver);
		cnv.getVenderNameTextField().sendKeys(vendorName);
		cnv.getEmailTextField().sendKeys(vendorMailId);
		cnv.getPhoneTextField().sendKeys(vendorPhone);
		cnv.getSaveButton().click();
		UtilityClassObject.getTest().log(Status.INFO, "Check Vendro Info in Header Text");
		VenderInfoPage vip = new VenderInfoPage(driver);
		String headName = vip.getHeaderInfo().getText();
		boolean a = headName.contains(vendorName);
		Assert.assertEquals(a, true);
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Product Page");
		hp.getProductsLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getCreateProduct().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Create New Product Page");
		CreatingNewProductPage cnpp = new CreatingNewProductPage(driver);
		cnpp.getProductNameTextField().sendKeys(product);
		WebElement productactive = cnpp.getProductActiveCheckBox();
		boolean pro = productactive.isSelected();
		Assert.assertEquals(pro, true);
		WebElement ele2 = cnpp.getProductCategoryDropDown();
		wlib.select(ele2, productcategory);
		String Salesstrtdate = jlib.getSystemDateYYYYDDMM();
		String salesEndDate = jlib.getRequiredDateYYYYDDMM(60);
		cnpp.getSalesStartDate().sendKeys(Salesstrtdate);
		cnpp.getSalesEndDate().sendKeys(salesEndDate);
		UtilityClassObject.getTest().log(Status.INFO, "Check the Handle user is checked");
		WebElement handlerUser = cnpp.getHandlerUserRadioBtn();
		boolean user = handlerUser.isSelected();
		Assert.assertEquals(user, true);
		cnpp.getSaveBtn();

	}
	@Test(groups = "smokeTest")
	public void createInvoice() throws Exception {
		UtilityClassObject.getTest().log(Status.INFO, "Read the Data from Excel");
		String orgname = elib.getDatafromExcel("org", 1, 2) + jlib.getRandomNumber();
		String firstname = elib.getDatafromExcel("Contact", 1, 2) + jlib.getRandomNumber();
		String lastname = elib.getDatafromExcel("Contact", 1, 3) + jlib.getRandomNumber();
		String product = elib.getDatafromExcel("Product", 1, 2) + jlib.getRandomNumber();
		String productcategory = elib.getDatafromExcel("Product", 1, 3);
		String productqty = elib.getDatafromExcel("Product", 1, 5);
		String productprice = elib.getDatafromExcel("Product", 1, 4);
		
		
		UtilityClassObject.getTest().log(Status.INFO, "Navibagte to Organisation page");
		HomePage hp = new HomePage(driver);
		hp.getOrganisationLink().click();
		UtilityClassObject.getTest().log(Status.INFO, "Click on new Organisation Button");
		OrganisationPage op = new OrganisationPage(driver);
		op.getCreateOrganisationBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to the create new organisation");
		creatingNewOrganisationPage cnop = new creatingNewOrganisationPage(driver);
		cnop.getOraganisationNameTxtField().sendKeys(orgname);
		cnop.getSaveBtn().click();
		Thread.sleep(2000);
		UtilityClassObject.getTest().log(Status.INFO, "Verify the Header Text ");
		OrganisationInfoPAge oip = new OrganisationInfoPAge(driver);
		String HeadName = oip.getOrgHeaderInfo().getText();
		boolean a = HeadName.contains(orgname);
		Assert.assertEquals(a, true);
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to the Contact Page");
		hp.getContactLink().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to new contact page");
		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Create the Contact with firstname and lastname ");
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.getFirstNameTxtField().sendKeys(firstname);
		cncp.getLastNameTxtField().sendKeys(lastname);
		cncp.getSaveBtn().click();
		Thread.sleep(2000);
		//Create a product
		hp.getProductsLink().click();
		ProductPage pp = new ProductPage(driver);
		pp.getCreateProduct().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Create New Product Page");
		CreatingNewProductPage cnpp = new CreatingNewProductPage(driver);
		cnpp.getProductNameTextField().sendKeys(product);
		WebElement productactive = cnpp.getProductActiveCheckBox();
		boolean pro = productactive.isSelected();
		Assert.assertEquals(pro, true);
		WebElement ele2 = cnpp.getProductCategoryDropDown();
		wlib.select(ele2, productcategory);
		String Salesstrtdate = jlib.getSystemDateYYYYDDMM();
		String salesEndDate = jlib.getRequiredDateYYYYDDMM(60);
		cnpp.getSalesStartDate().sendKeys(Salesstrtdate);
		cnpp.getSalesEndDate().sendKeys(salesEndDate);
		cnpp.getProductPrice().sendKeys(productprice);
		cnpp.getProductStock().sendKeys(productqty);
		
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Invoice Page");
		WebElement ele1 = hp.getMoreLink();
		wlib.mouseMoveOnElement(driver, ele1);
		MoreLinkPopUp mp = new MoreLinkPopUp(driver);
		mp.getInvoice().click();
		
		
		
		
	}

}
