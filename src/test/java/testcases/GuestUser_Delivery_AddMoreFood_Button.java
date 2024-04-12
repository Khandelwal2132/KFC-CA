package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class GuestUser_Delivery_AddMoreFood_Button extends Listeners {
	@Test
	public void Validate_GuestUser_Delivery_AddMoreFood_Button() throws InterruptedException, IOException {
		hp.SelectDeliveryLocation();
		Thread.sleep(3000);
		reportEvent("PASS","store selected successfully",true);
		mp.AddtoCart();
		Thread.sleep(2000);
		reportEvent("PASS","Items added to cart successfully",true);
		mp.GoToCart();
		Thread.sleep(2000);
	    mp.GetAddMoreFood().click();
	    Thread.sleep(3000);
	    if(driver.getCurrentUrl().contains("menu")) {
	    	System.out.println("Validation successful");
	    }
	    else {
	    	Assert.fail();
	    }
		
}
}
