package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class MA_DeleteAccount extends Listeners{

	@Test
	public void ClickDeleteAccount() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		
//		mp.closePopUp().click();
		map.Getmyaccountlink().click();
//		mp.closePopUp().click();
		Thread.sleep(1000);
		map.GetSavedContacts().click();
		Thread.sleep(1000);
		map.GetDeleteAccount().click();
		Thread.sleep(1000);

		
	}
}
