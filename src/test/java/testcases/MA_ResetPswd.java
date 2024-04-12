package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class MA_ResetPswd extends Listeners{

	@Test
	public void Click_ResetPswd() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		map.Getmyaccountlink().click();
//		mp.closePopUp().click();
		Thread.sleep(1000);
		map.GetResetPassword().click();
		Thread.sleep(1000);
		map.ResetPassword();
		Thread.sleep(1000);
		map.GetUpdatePassword().click();
		Thread.sleep(3000);
		
	}
}
