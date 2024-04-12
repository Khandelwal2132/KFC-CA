package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;
public class Invalid_Coupon extends Listeners {
	@Test
	public void ValidateInvalid_Coupon() throws InterruptedException, IOException {
		hp.SelectDeliveryLocation();
		Thread.sleep(1000);
		reportEvent("PASS","store selected successfully",true);
		mp.getSandwichitem().click();
		Thread.sleep(4000);
		reportEvent("PASS","Items added to cart successfully",true);
//		mp.addToCart().click();
		Thread.sleep(4000);
		mp.GoToCart();
		Thread.sleep(7000); 
		cp.GetCouponBox().sendKeys("DM10");
		cp.GetApplybutton().click();
		Thread.sleep(4000);


	}
}
