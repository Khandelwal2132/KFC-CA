package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;;

public class RegisteredUserPickup_ByCash extends Listeners {
	@Test
	public void ValidateRegisteredUserPickup_ByCash() throws InterruptedException, IOException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectPickupLocationForRegisteruser();
		Thread.sleep(7000);
		reportEvent("PASS","store selected successfully",true);
		mp.closePopUp().click();
		Thread.sleep(5000);
		mp.getMenuButton().click();
		//Thread.sleep(5000);
	//	mp.closePopUp().click();
		mp.getSandwichitem().click();
		mp.AddtoCart();
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(1000);
//		cp.GetProceedToCheckout();
//		chp.GetPayByCash().click();
//		Thread.sleep(1000);
//		reportEvent("PASS","Navigated to checkout page successfully",true);

	}
	
}
