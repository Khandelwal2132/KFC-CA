package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class RegisteredUserDeliveryStoreSelection extends Listeners {
	
	@Test
	public void ValidateRegisteredUserDeliveryStoreSelection() throws InterruptedException
	{
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectDeliveryLocationForRegisteruser();
		Thread.sleep(5000);
		reportEvent("PASS","store selected successfully",true);
		
	}

}
