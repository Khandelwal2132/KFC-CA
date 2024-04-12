package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class loginInvalidIdValidPass extends Listeners {
	
	@Test
	public void validateLoginInvalidIdValidPass() throws InterruptedException
	{
		lp.loginInvalidIdValidPass();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(true,url.contains("login"));
		Thread.sleep(5000);
	}

}

