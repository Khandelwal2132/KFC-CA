package testcases;
import org.testng.annotations.Test;
import extentlisteners.Listeners;
public class MA_PreviousOrder extends Listeners {
	
	
	
	@Test
	public void ClickPreviousOrder() throws InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		Thread.sleep(7000);
		mp.getMenuButton().click();
		mp.closePopUp().click();
	Thread.sleep(5000);
		map.Getmyaccountlink().click();
		Thread.sleep(1000);
		map.GetpreviousOrders().click();
		Thread.sleep(1000);
//		map.GetReorderNowbutton();
		
		
		//driver.findElement(By.xpath("//p[text()='Select A Recent Address']")).isDisplayed();
//	WebElement  p=driver.findElement(By.xpath("//h3[text()='Your previous orders']"));
//	
//		Assert.assertEquals(true, p.isDisplayed());
		
	}
}
