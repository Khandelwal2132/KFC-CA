package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class loginInvalidIdandPass extends Listeners {
	
	@Test
	public void validateLoginInvalidIdandPass() throws InterruptedException
	{
		lp.loginInvalidIdandPass();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(true,url.contains("login"));
		Thread.sleep(5000);
	}

}
