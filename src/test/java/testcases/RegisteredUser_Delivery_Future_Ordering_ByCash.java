package testcases;
import java.io.IOException;

import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class RegisteredUser_Delivery_Future_Ordering_ByCash extends Listeners {
	@Test
	public void ValidateRegisteredUser_Delivery_Future_Ordering_ByCash() throws InterruptedException, IOException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectDeliveryLocationForRegisteruser();
		//ss.preOrderForDelivery().click();
		//Go to menu page and select item 		
		Thread.sleep(7000);
		reportEvent("PASS","store selected successfully",true);
		mp.closePopUp().click();
		Thread.sleep(2000);
		mp.getMenuButton().click();
		Thread.sleep(1000);
		mp.GetChangelocationpopup().click();		
		mp.GetChangeForDatetime().click();
		mp.GetChangeForDate().click();
		Thread.sleep(1000);
		mp.SelectfutureDate().click();
		Thread.sleep(1000);
		mp.Update().click();
		Thread.sleep(1000);
		mp.SaveChanges().click();
		Thread.sleep(3000);
		reportEvent("PASS","Future date Selected successfully",true);
		mp.getSandwichitem().click();
	//	Thread.sleep(2000);
//		mp.addToCart().click();
//		driver.navigate().refresh();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(2000);
//		cp.GetProceedToCheckout();
//		Thread.sleep(2000);
//		chp.GetPayByCash().click();
//		Thread.sleep(3000);
//		reportEvent("PASS","Navigated to checkout page successfully",true);

}
	
}
