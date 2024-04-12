package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class AccountLockout extends Listeners  {
	@Test
	public void validateAccountLockout() throws InterruptedException
	{
		
		lp.AccountLockout();
		Thread.sleep(5000);
	}
}