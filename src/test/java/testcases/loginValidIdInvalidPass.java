package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class loginValidIdInvalidPass extends Listeners {
	
	@Test
	public void validateLoginValidIdInvalidPass() throws InterruptedException
	{
		lp.loginValidIdInvalidPass();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(true,url.contains("login"));
		Thread.sleep(5000);
	}

}

