package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class ValidateCreateAccountTC1 extends Listeners {

	@Test
	public void ValidateNonRegisteredmail() throws InterruptedException {
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
//	    need to give new mail id on every running
//		cap.GetMessageForfailedCreateaccount().isDisplayed();
//		test.log(Status.PASS, "successful RegisterUser Delivery mode");


	}
	

}
