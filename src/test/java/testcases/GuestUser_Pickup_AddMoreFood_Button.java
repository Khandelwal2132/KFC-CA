package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class GuestUser_Pickup_AddMoreFood_Button extends Listeners{
	@Test
	public void ValidateGuestUser_Pickup_AddMoreFood_Button() throws InterruptedException, IOException {
	
		hp.SelectPickupLocation();
		reportEvent("PASS","store selected successfully",true);
		mp.getSandwichitem().click();
		Thread.sleep(3000);
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
