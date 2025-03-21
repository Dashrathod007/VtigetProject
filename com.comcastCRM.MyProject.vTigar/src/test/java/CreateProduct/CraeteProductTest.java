package CreateProduct;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.generic.WebDriverUtility.UtilityClassObject;
import com.comcast.crm.objectrepositoryUtility.CreatingNewProductPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewVender;
import com.comcast.crm.objectrepositoryUtility.HomePage;
import com.comcast.crm.objectrepositoryUtility.MoreLinkPopUp;
import com.comcast.crm.objectrepositoryUtility.ProductPage;
import com.comcast.crm.objectrepositoryUtility.VenderInfoPage;
import com.comcast.crm.objectrepositoryUtility.VenderPage;

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
	
	}
