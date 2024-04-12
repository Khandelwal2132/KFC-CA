package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class ValidateCreateAccountTC2 extends Listeners {
	
	@Test
	public void ValidateRegistermail() throws InterruptedException {
		lp.getKfcSignInLink().click();
		cap.getcreateAccountLP().click();
		Thread.sleep(5000);
		cap.GetFirstname().sendKeys(prop.getProperty("firstname"));
		cap.GetLastname().sendKeys(prop.getProperty("lastname"));
		cap.GetcontactNumber().sendKeys(prop.getProperty("contactnumber"));
		cap.GetEmail().sendKeys(prop.getProperty("Nonregisteredemail"));
		cap.GetPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		cap.GetIAgreeCheckbox();
		cap.GetCreateAccount();
//		boolean pass=false;
//		 pass=ca.GetMessageForfailedCreateaccount().isDisplayed();
//		Assert.assertEquals(pass, true);
//		test.log(Status.PASS, "successful RegisterUser Delivery mode");
		
	}
}
