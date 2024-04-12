package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;


public class FooterlinkValidation_ByGuestUser extends Listeners {
	@Test
	public void ValidateFooterlinks() throws InterruptedException {
		fs.Aboutus();
		fs.Customerservice();
		fs.Nutrition();
		fs.KFCVIP();
		fs.polices();
		reportEvent("PASS","Validated all footer links successfully",true);
				
	}

}
