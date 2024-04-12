package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class IncorrectCarddetailsValidation extends Listeners {
	@Test
	public void EnterInValidCardDetails() throws InterruptedException, IOException {
		
		
		hp.SelectDeliveryLocation();
		reportEvent("PASS","store selected successfully",true);
		mp.getSandwichitem().click();
		Thread.sleep(3000);
		reportEvent("PASS","Items added to cart successfully",true);
//		mp.addToCart().click();
		Thread.sleep(2000);
		mp.GoToCart();
		Thread.sleep(2000);
//		cp.GetProceedToCheckout();
//		chp.EnterGuestUserDatails();
//		reportEvent("PASS","Navigated to checkout page successfully",true);
//		chp.EnterPayOnlineByInValidCreditCardDetails();
//		chp.GetIAgreecheckBox().click();

		
	}

}
