package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class ValidatePlusAndMinus_ByRegisteredUser extends Listeners {

	@Test
	public void ValidatePlusAndMinusInCartPageTest() throws IOException, InterruptedException {

		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectPickupLocationForRegisteruser();
		Thread.sleep(7000);
		reportEvent("PASS","store selected successfully",true);
		mp.closePopUp().click();
		Thread.sleep(3000);
		mp.getMenuButton().click();
		Thread.sleep(3000);
		
		//Go to menu page and select item 
		
		Thread.sleep(5000);
		mp.getSandwichitem().click();
		Thread.sleep(4000);
		mp.AddtoCart();
		Thread.sleep(5000);
		mp.GoToCart();
		Thread.sleep(7000);
		for(int i=4;i>=0;i--) 
		{
		cp.GetsingleplusButton().click();
		Thread.sleep(1000);
		}
		reportEvent("PASS","Item quantity increased successfully",true);
		Thread.sleep(7000);
		for(int i=3;i>=0;i--) {
			cp.GetsingleMinusButton().click();
			}
		reportEvent("PASS","Item quantity Decreased successfully",true);		
		cp.GetProceedToCheckout();
		
//		Thread.sleep(4000);
//		chp.GetRegisteredCard().click();
//		System.out.println("Hello2");
//		Thread.sleep(4000);


		
	}	
}
