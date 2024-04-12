package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class HeaderLinksForRegisterUserValidations extends Listeners {
	@Test
	public void ValidateHeaderLinksForRegisterUser() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hs.Headlinks();
		hs.headbartabsClick();
	}

}
