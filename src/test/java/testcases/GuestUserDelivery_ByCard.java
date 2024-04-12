package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;
public class GuestUserDelivery_ByCard extends Listeners  {
	@Test
	public void ValidateGuestUserDelivery_ByCard() throws InterruptedException, IOException {
		hp.SelectDeliveryLocation();
		Thread.sleep(3000);
		reportEvent("PASS","store selected successfully",true);
		mp.AddtoCart();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(3000);
//		cp.GetProceedToCheckout();
//		chp.EnterGuestUserDatails();
//		Thread.sleep(3000);
//		reportEvent("PASS","Navigated to checkout page successfully",true);
//		chp.EnterPayOnlineByCreditCardDetails();
//		chp.GetIAgreecheckBox().click(); 
//		Thread.sleep(3000);

		
}
	}
