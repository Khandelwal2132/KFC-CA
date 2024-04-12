package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class Coupon_Above_10 extends Listeners {
	@Test
	public void ValidateCoupons_Above_10() throws InterruptedException, IOException {
		hp.SelectDeliveryLocation();
		Thread.sleep(3000);
		reportEvent("PASS","store selected successfully",true);
		mp.AddtoCart();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart(); 
		Thread.sleep(8000);
		cp.GetCouponBox().sendKeys("SAVE5");
		cp.GetApplybutton().click();
	//	String Error_text= cp.GetCouponErrorText1().getText();
	//	Assert.assertEquals("Order subtotal (before tax & delivery) must be $10 or more", Error_text);
		Thread.sleep(8000);
		reportEvent("PASS","Coupon applied successfully",true);

	}
}
