package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class GuestUserDeliveryStoreSelection extends Listeners {

	@Test
	public void ValidateGuestUserDeliveryStoreSelection() throws InterruptedException {
		hp.SelectDeliveryLocation();
		Thread.sleep(5000);
		reportEvent("PASS","store selected successfully",true);
		
	}

}
