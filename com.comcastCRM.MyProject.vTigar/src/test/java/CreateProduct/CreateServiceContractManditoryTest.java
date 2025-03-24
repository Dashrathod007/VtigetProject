package CreateProduct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.BaseClassUtility.BaseClass;
import com.comcast.crm.generic.WebDriverUtility.UtilityClassObject;
import com.comcast.crm.objectrepositoryUtility.ContactPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewContactPage;
import com.comcast.crm.objectrepositoryUtility.CreatingNewServiceContactPage;
import com.comcast.crm.objectrepositoryUtility.HomePage;
import com.comcast.crm.objectrepositoryUtility.MoreLinkPopUp;
import com.comcast.crm.objectrepositoryUtility.OrganisationPage;
import com.comcast.crm.objectrepositoryUtility.ServiceContractPage;
import com.comcast.crm.objectrepositoryUtility.creatingNewOrganisationPage;

@Listeners(com.comcast.crm.listenerUtility.ListenerImplementationClass.class)

public class CreateServiceContractManditoryTest extends BaseClass {
	@Test(groups = "smokeTest")
	public void createServiceContract() throws Exception {
		UtilityClassObject.getTest().log(Status.INFO, "Read The Data From Excel File");
		String Orgname = elib.getDatafromExcel("Create Contract", 1, 1) + jlib.getRandomNumber();
		String firstName = elib.getDatafromExcel("Create Contract", 1, 2) + jlib.getRandomNumber();
		String lastName = elib.getDatafromExcel("Create Contract", 1, 3) + jlib.getRandomNumber();
		String Sub = elib.getDatafromExcel("Create Contract", 1, 4);

		UtilityClassObject.getTest().log(Status.INFO, "Navibagte to Organisation page");
		HomePage hp = new HomePage(driver);
		hp.getOrganisationLink().click();
		UtilityClassObject.getTest().log(Status.INFO, "Click on new Organisation Button");
		OrganisationPage op = new OrganisationPage(driver);
		op.getCreateOrganisationBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to the create new organisation");
		creatingNewOrganisationPage cnop = new creatingNewOrganisationPage(driver);
		cnop.getOraganisationNameTxtField().sendKeys(Orgname);
		cnop.getSaveBtn().click();
		Thread.sleep(2000);
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to the Contact Page");
		hp.getContactLink().click();
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to new contact page");
		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "Create the Contact with firstname and lastname ");
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.getFirstNameTxtField().sendKeys(firstName);
		cncp.getLastNameTxtField().sendKeys(lastName);
		cncp.getSaveBtn().click();

		WebElement ele1 = hp.getMoreLink();
		wlib.mouseMoveOnElement(driver, ele1);
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to Create New Service Contract Page");
		MoreLinkPopUp mp = new MoreLinkPopUp(driver);
		mp.getCreateServiceContract().click();
		ServiceContractPage scp = new ServiceContractPage(driver);
		scp.getCreateNewContarctBtn().click();
		CreatingNewServiceContactPage cnsp = new CreatingNewServiceContactPage(driver);
		
		WebElement ele2 = cnsp.getRelatedToDropDown();
		wlib.select(ele2, "Organizations");
		cnsp.getAddBtn().click();
		cnsp.SwitchToOrgPopUp();
		cnsp.getSearchOrgField().sendKeys(Orgname);
		cnsp.getSeachOrgbtn().click();
		driver.findElement(By.xpath("//a[text()='" + Orgname + "']")).click();
		wlib.switchToWindowByURL(driver, "module=ServiceContracts&action");
		String dueDate = jlib.getRequiredDateYYYYDDMM(60);
		cnsp.getDueDate().sendKeys(dueDate);
		cnsp.getSaveBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, "To check Alert MSg Displayed");
		Alert alert = driver.switchTo().alert();
		String AlertMsg = alert.getText();
		String Msg="Subject cannot be empty";
		boolean a = AlertMsg.contains(Msg);
		Assert.assertEquals(a, true);
		wlib.AlertPopupAccept(driver);
		cnsp.getSubTextField().sendKeys(Sub);
		cnsp.getSaveBtn().click();
		String HeaderInfo = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		boolean info = HeaderInfo.contains(Sub);
		Assert.assertEquals(info, true);

	}

}
