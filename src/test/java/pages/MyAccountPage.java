package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BaseClass {
	
	public WebDriver driver;
	public WebDriverWait wait;

	public MyAccountPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
	@FindBy(xpath="(//a[contains(text(),'REORDER NOW')])[1]")
	 WebElement LastOrderReorderNowbutton;
	
	@FindBy(xpath="//span[text()='ADD TO ORDER']")
	 WebElement favouriteitemAddtoCart;
	@FindBy(xpath="//a[@data-gtm-event-name='reOrder']")
	 WebElement fevOrderReorderButton;
	
	@FindBy(xpath="//a[@href='/myaccount']")
	 WebElement myAccount;
	
	@FindBy(xpath="//input[@id='CurrentPassword']")
	 WebElement CurrentPassword;
	
	@FindBy(xpath="//input[@id='Password']")
	 WebElement NewPassword;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	 WebElement CnfPassword;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	 WebElement UpdatePassword;
	
	By previousOrders=By.xpath("//a[text()='My previous orders']");
	//By LastOrderReorderNowbutton=By.xpath("(//a[contains(text(),'REORDER NOW')])[1]");
	By LastOrderReorderNowbutton1=By.partialLinkText("REORDER");
	By favouriteOrders=By.xpath("//a[text()='My favourite orders']");
	By favouriteItems=By.xpath("//a[text()='My favourite items']");
	By savedAddesses=By.xpath("//a[text()='Saved addresses']");
	By SavedContacts=By.xpath("//a[@href='/MyAccount/Edit?Length=11']");
	By signout=By.xpath("//a[text()='Sign out']");
	By ResetPassword=By.xpath("//a[text()='Reset password']");
	By myaccountlink=By.xpath("//a[@href=\"/myaccount\"]");
	By UpdateContactDetails=By.xpath("//input[@id='myAccountSubmit']");
	By SavedPlacementDetails=By.xpath("//a[@href='/PHMyAccount/SavedPaymentDetails']");
	By DeleteAccount=By.xpath("//a[@id='deleteUser']");
//	By UpdatePassword=By.xpath("//button[@id='btnSubmit']");

	

//	By ResetPassword=By.xpath("//a[@href='/PHMyAccount/SavedPaymentDetails']");
	
//	By myaccountlink=By.cssSelector("auth-link float-right");
	
	public WebElement Getmyaccountlink() {
		return myAccount;
	}
	public WebElement GetpreviousOrders() {
		return driver.findElement(previousOrders);
	}
	public WebElement GetfavouriteOrders() {
		return driver.findElement(favouriteOrders);
	}
	public WebElement GetfavouriteItems() {
		return driver.findElement(favouriteItems);
	}
	public WebElement GetsavedAddesses() {
		return driver.findElement(savedAddesses);
	}
	public WebElement GetSavedContacts() {
		return driver.findElement(SavedContacts);
	}
	public WebElement GetUpdateContactDetails() {
		return driver.findElement(UpdateContactDetails);
	}
	public WebElement GetSavedPlacementDetails() {
		return driver.findElement(SavedPlacementDetails);
	}
	public WebElement Getsignout() {
		return driver.findElement(signout);
	}
	public WebElement GetResetPassword() {
		return driver.findElement(ResetPassword);
	}
	public WebElement GetDeleteAccount() {
		return driver.findElement(DeleteAccount);
	}
	
	public WebElement getmyAccount()
	{
		return myAccount;
	}
	public WebElement getfevOrderReorderButton()
	{
		return fevOrderReorderButton;
	}
	
	public WebElement GetCurrentPassword() {
		return CurrentPassword;
	}
	public WebElement GetNewPassword() {
		return NewPassword;
	}
	public WebElement GetCnfPassword() {
		return CnfPassword;
	}
	
	public WebElement GetUpdatePassword() {
		return UpdatePassword;
	}
	
	public void ResetPassword() {
		CurrentPassword.sendKeys(prop.getProperty("ValidPassword"));
		NewPassword.sendKeys(prop.getProperty("ValidPassword"));
		CnfPassword.sendKeys(prop.getProperty("ValidPassword"));
	}
	
	public void GetReorderNowbutton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", LastOrderReorderNowbutton );
		
	}
public void GetFavouriteitem() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", favouriteitemAddtoCart );
	
}
	
}
