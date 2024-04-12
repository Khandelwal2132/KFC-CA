package testcases;
import org.testng.annotations.Test;

import extentlisteners.Listeners;
public class MA_favouriteItems extends Listeners {
	@Test
	public void ClickfavouriteItems() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
//		mp.closePopUp().click();
		map.Getmyaccountlink().click();
		map.GetfavouriteItems().click();

		
	}

}
