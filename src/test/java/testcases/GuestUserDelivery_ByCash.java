package testcases;
import java.io.IOException;

import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class GuestUserDelivery_ByCash extends Listeners {

	@Test
	public void ValidateGuestUserDelivery_ByCash() throws InterruptedException, IOException {
		hp.SelectDeliveryLocation();
		Thread.sleep(3000);	
		reportEvent("PASS","store selected successfully",true);
		mp.AddtoCart();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(3000);
//		cp.GetProceedToCheckout();
//	    chp.EnterGuestUserDatails();
//		Thread.sleep(3000);
//		reportEvent("PASS","Navigated to checkout page successfully",true);
//		chp.GetPayByCash().click();

		
	}
	


}


