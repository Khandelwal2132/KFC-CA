package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class CouponValidation extends Listeners {
	@Test(priority=0)
	public void ValidateCoupons() throws InterruptedException, IOException {
		hp.SelectDeliveryLocation();
		Thread.sleep(3000);
		reportEvent("PASS","store selected successfully",true);
		mp.AddtoCart();
		Thread.sleep(5000);; 
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(7000);
		cp.GetCouponBox().sendKeys("SAVE5");
		cp.GetApplybutton().click();
		Thread.sleep(5000);
		reportEvent("PASS","Coupon applied successfully",true);

	}


}
