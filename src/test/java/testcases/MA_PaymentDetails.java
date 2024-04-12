package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class MA_PaymentDetails extends Listeners {
	@Test
	public void Click_PaymentDetails() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
	    Thread.sleep(7000);
		map.Getmyaccountlink().click();
//		mp.closePopUp().click();
		Thread.sleep(1000);
		map.GetSavedPlacementDetails().click();
		Thread.sleep(1000);

	}
}
