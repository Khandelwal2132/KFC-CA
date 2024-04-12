package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import extentlisteners.Listeners;
public class Guest_User_PickUp_Future_Ordering_ByCard extends Listeners{
	@Test
	public void Validate_Guest_User_PickUp_Future_Ordering_ByCard() throws InterruptedException, IOException {
	hp.SelectPickupLocation();
	Thread.sleep(3000);
	reportEvent("PASS","store selected successfully",true);
	mp.GetChangelocationpopup().click();
	mp.GetChangeForDatetime().click();
	mp.GetChangeForDate().click();
	mp.SelectfutureDate().click();
	mp.Update().click();
	mp.SaveChanges().click();
	Thread.sleep(3000);
	reportEvent("PASS","Future date Selected successfully",true);
	mp.getSandwichitem().click();
	Thread.sleep(2000);
	reportEvent("PASS","Items added to cart successfully",true);
	mp.GoToCart();
	Thread.sleep(2000);
//	cp.GetProceedToCheckout();
//	chp.EnterGuestUserDatails();
//	reportEvent("PASS","Navigated to checkout page successfully",true);
//	chp.EnterPayOnlineByCreditCardDetails();
//	Thread.sleep(2000);
//	chp.GetIAgreecheckBox().click();
//	Thread.sleep(2000);

}
}
