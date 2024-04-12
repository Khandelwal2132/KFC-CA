package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class BehindTheBucket_ByGuestUser extends Listeners {

	@Test
	public void ValidateBehindTheBucket_ByGuestUser() throws InterruptedException {
		
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
