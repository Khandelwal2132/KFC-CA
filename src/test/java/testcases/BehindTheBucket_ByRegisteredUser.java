package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;


public class BehindTheBucket_ByRegisteredUser extends Listeners{

	@Test
	public void ValidateBehindTheBucket_ByRegisteredUser() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		btb.getBehindTheBucket().click();	
		btb.getOurFood().click();
		Thread.sleep(1000);
		btb.getOurPlanet().click(); 
		Thread.sleep(1000);
		btb.getOurPeople().click();
		Thread.sleep(2000);
		btb.getArrowButton().click();
		Thread.sleep(2000);
		reportEvent("PASS","Behind the Bucket Validation successfull",true);
		
		}
}
