package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class RegisteredUser_Pickup_AddMoreFood_Button extends Listeners{
	@Test
	public void ValidateRegisteredUser_Pickup_AddMoreFood_Button() throws InterruptedException, IOException {
		
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectPickupLocationForRegisteruser();
		Thread.sleep(7000);	
		reportEvent("PASS","store selected successfully",true);
		mp.closePopUp().click();
		Thread.sleep(5000);
		mp.getMenuButton().click();
		mp.AddtoCart();
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
