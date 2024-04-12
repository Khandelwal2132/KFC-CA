package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class ValidateCheckout extends Listeners {
	
	@Test
	public void ValidateCheckoutTest() throws IOException, InterruptedException {
	
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectPickupLocationForRegisteruser();
		Thread.sleep(7000);
		reportEvent("PASS","store selected successfully",true);
		mp.closePopUp().click();
		Thread.sleep(5000);
		mp.getMenuButton().click();
		mp.getSandwichitem().click();
		mp.AddtoCart();
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(1000);
//		cp.GetProceedToCheckout();
//		chp.GetPayByCash().click();
//		reportEvent("PASS","Navigated to checkout page successfully",true);
	}

	
}
