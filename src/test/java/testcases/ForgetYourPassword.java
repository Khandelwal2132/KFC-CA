package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class ForgetYourPassword extends Listeners  {
	@Test
	public void validateForgetYourPassword() throws InterruptedException
	{
		reportEvent("PASS","Authonticated successfully",true);
		lp.getKfcSignInLink().click();
		Thread.sleep(2000);
		lp.getForgetYourPassword().click();
		Thread.sleep(5000);
		lp.getForgetYourPasswordMail().sendKeys("pooja.khandelwal@cognizant.com");
		Thread.sleep(2000);
		lp.getForgetYourPasswordMailSubmitButton().click();
	}
}
