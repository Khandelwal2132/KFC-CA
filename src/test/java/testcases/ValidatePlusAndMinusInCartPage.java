package testcases;
import java.io.IOException;
import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class ValidatePlusAndMinusInCartPage extends Listeners {

	@Test
	public void ValidatePlusAndMinusInCartPageTest() throws IOException, InterruptedException {
		lp.loginValidIdandPass();
		reportEvent("PASS","User Logged in successfully",true);
		hp.SelectPickupLocationForRegisteruser();
		Thread.sleep(7000);
		reportEvent("PASS","store selected successfully",true);
		//ss.preOrderForDelivery().click();
		//Go to menu page and select item 
		mp.closePopUp().click();
		Thread.sleep(5000);
		mp.getMenuButton().click();
		mp.getSandwichitem().click();
		Thread.sleep(4000);
		mp.AddtoCart();
		Thread.sleep(5000);
		mp.GoToCart();
		Thread.sleep(7000);
		for(int i=4;i>=0;i--) {
		cp.GetsingleplusButton().click();
		}
		reportEvent("PASS","Item quantity increased successfully",true);
		Thread.sleep(7000);
		for(int i=2;i>=0;i--) {
			cp.GetsingleMinusButton().click();
			}
		reportEvent("PASS","Item quantity Decreased successfully",true);	
		Thread.sleep(3000);
//		cp.GetProceedToCheckout();
//		System.out.println("Hello");
//		Thread.sleep(4000);
//		chp.GetRegisteredCard().click();
//		System.out.println("Hello2");
//		Thread.sleep(4000);


		
		

	}

}
