package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;
public class MA_ValidateSignout extends Listeners {

	
	
	@Test
	public void ValidateSignout() throws InterruptedException {
		
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		map.Getmyaccountlink().click();
		map.Getsignout().click();
		reportEvent("PASS","Logged out successfully",true);

	}

}
