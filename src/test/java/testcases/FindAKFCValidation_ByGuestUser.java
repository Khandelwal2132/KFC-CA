package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class FindAKFCValidation_ByGuestUser extends Listeners {
	@Test
	public void ValidateFindAKFC() throws InterruptedException {
		
		
		hp.FindAKFC().click();
		
	}
	

}
