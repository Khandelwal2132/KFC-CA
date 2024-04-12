package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class GuestUserPickupStoreSelection extends Listeners{
	@Test
	public void ValidateGuestUserPickupStoreSelection() throws InterruptedException {
		hp.SelectPickupLocation();
		Thread.sleep(5000);
		reportEvent("PASS","store selected successfully",true);
	}

}
