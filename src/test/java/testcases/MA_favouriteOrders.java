package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class MA_favouriteOrders extends Listeners {
	@Test
	public void ClickfavouriteOrders() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);


		map.Getmyaccountlink().click();
		map.GetfavouriteOrders().click();
		
	}

	

}
