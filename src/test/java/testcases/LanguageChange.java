package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class LanguageChange extends Listeners {
	
	@Test
	public void ValidateLanguageChange() throws InterruptedException
	{
		Thread.sleep(5000);
		hp.GetLanguageChange().click();
		Thread.sleep(5000);
	}

}
