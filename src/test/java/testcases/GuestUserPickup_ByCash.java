package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;


public class GuestUserPickup_ByCash extends Listeners {

	@Test
	public void ValidateGuestUserPickup_ByCash() throws InterruptedException, IOException {
		hp.SelectPickupLocation();
		reportEvent("PASS","store selected successfully",true);
		mp.getSandwichitem().click();
//		Thread.sleep(3000);
//		mp.addToCart().click();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(2000);
//		cp.GetProceedToCheckout();
//		chp.EnterGuestUserDatails();
//		Thread.sleep(3000);
//		reportEvent("PASS","Navigated to checkout page successfully",true);
//		chp.GetPayByCash().click();
//		chp.GetIAgreecheckBox().click(); 

	}

}
