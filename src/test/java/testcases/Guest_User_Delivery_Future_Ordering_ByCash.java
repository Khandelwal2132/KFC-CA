package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class Guest_User_Delivery_Future_Ordering_ByCash extends Listeners {
	
	@Test
	public void ValidateGuest_User_Delivery_Future_Ordering_ByCash() throws InterruptedException, IOException
	{
		hp.SelectDeliveryLocation();
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
		mp.getMenuButton().click();
		Thread.sleep(1000);
		mp.getSandwichitem().click();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(2000);
//		cp.GetProceedToCheckout();
//		chp.EnterGuestUserDatails();
//		reportEvent("PASS","Navigated to checkout page successfully",true);
//		chp.GetPayByCash().click();
//		Thread.sleep(2000);
//		chp.GetIAgreecheckBox().click();
//		Thread.sleep(2000);

	}
	

}
