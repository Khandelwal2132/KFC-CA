package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class RegisteredUserDelivery_ByCash extends Listeners {

	@Test
	public void ValidateRegisteredUserDelivery_ByCash() throws InterruptedException, IOException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectDeliveryLocationForRegisteruser();
		Thread.sleep(7000);
		reportEvent("PASS","store selected successfully",true);
//		mp.getMenuButton().click();
//		Thread.sleep(3000);
		mp.closePopUp().click();
		Thread.sleep(5000);
		mp.AddtoCart();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(2000);

		
	}
	
}
