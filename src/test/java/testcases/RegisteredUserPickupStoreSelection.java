package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;
public class RegisteredUserPickupStoreSelection extends Listeners {
	
	@Test
	public void ValidateRegisteredUserPickupStoreSelection() throws InterruptedException {
		
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectPickupLocationForRegisteruser();
		Thread.sleep(5000);
		reportEvent("PASS","store selected successfully",true);
	}

}
