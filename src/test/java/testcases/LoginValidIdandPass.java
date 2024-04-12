package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class LoginValidIdandPass extends Listeners {
	
	
	@Test
	public void ValidateLoginValidIdandPass() throws InterruptedException
	{
		
		lp.loginValidIdandPass();
		String url=driver.getCurrentUrl();
		if(url.contains("login"))
		{
			Assert.assertFalse(true);
		}
		reportEvent("PASS","User Logged in successfully",true);
	}

}
