package testcases;

import org.testng.annotations.Test;
import extentlisteners.Listeners;


public class HeaderlinkValidation extends Listeners {
	@Test
	public void ValidateHeaderlinks() throws InterruptedException {
		lp.loginValidIdandPass();
		hs.Headlinks();
		hs.headbartabsClick();
	}

}
