package testcases;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class MA_SavedContactDetails extends Listeners{

	@Test
	public void Click_SavedContactDetails() throws InterruptedException {
		
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		map.Getmyaccountlink().click();
//		mp.closePopUp().click();
		Thread.sleep(1000);
		map.GetSavedContacts().click();
		Thread.sleep(1000);
		map.GetUpdateContactDetails().click();
		Thread.sleep(1000);
//		WebElement  p=driver.findElement(By.xpath("//a[@id='Add_Address']"));
//		Assert.assertEquals(true, p.isDisplayed());
		
	}
}
