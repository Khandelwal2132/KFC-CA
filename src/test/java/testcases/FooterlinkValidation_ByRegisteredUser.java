package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class FooterlinkValidation_ByRegisteredUser extends Listeners{
	@Test
	public void ValidateFooterlinks() throws InterruptedException {
		Thread.sleep(2000);
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		fs.Aboutus();
		fs.Customerservice();
		fs.Nutrition();
		fs.KFCVIP();
		fs.polices();
		reportEvent("PASS","Validated all footer links successfully",true);
				
	}
}
