package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage extends BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public CheckoutPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	//Payment methods
	By PayByCash=By.xpath("//label[@for='PayByCash']");
	By PayOnlineByCreditCard=By.xpath("//label[contains(text(),'Pay online by credit card')]");
	//By RegisteredCard=By.xpath("//label[@class='btn btn-link btnCreditCard_1361 collapsed']");
	By CreditCardOnDelivery=By.xpath("//label[contains(text(),'Credit card on delivery)]");
	By DebitcardOnDelivery=By.xpath("//label[contains(text(),'Debit card on delivery')]");
	//By PlaceOrder=By.xpath("(//input[@value='PLACE ORDER'])[1]");
	By IAgreecheckBox=By.cssSelector("label.iagreeCheckbox.margin-bottom-10.mt-3");
	//payment methods for register user
	
	@FindBy(xpath="//label[@class='btn btn-link btnCreditCard_1361 collapsed']")
	 WebElement RegisteredCard;
	
	@FindBy(xpath="//label[contains (text(),'xxxx4415')]")
	 WebElement RegisteredCreditcard;
	
	@FindBy(xpath="(//input[@value='PLACE ORDER'])[1]")
	 WebElement PlaceOrder;
	//Guest User details
	@FindBy(css="input#fname")
	 WebElement guestUserFirstname;
	
	@FindBy(css="input#lname")
	 WebElement guestUserLastname;
	
	@FindBy(css="input#ContactPhone")
	 WebElement guestUserContactnumber;
	
	@FindBy(css="input#Email")
	 WebElement guestUserEmail;
	
	//Credit card Details
	@FindBy(css="input#cardholderName")
	 WebElement CardHolderName;
	@FindBy(css="input#cardNumber")
	 WebElement CardNumber;
	@FindBy(xpath="//span[@id=\"cardNumber-error\"]")
	 WebElement InvalidCarderrorMessage;
	@FindBy(css="input#expiryDate")
	 WebElement CardExpiryDate;
	@FindBy(css="input#cvn")
	 WebElement CardCvv;
	
	@FindBy(css="input#streetNo")
	 WebElement StreetNo;
	@FindBy(css="input#postCode")
	 WebElement PostCode;
	
	public WebElement GetRegisteredCard() {
		return RegisteredCreditcard;
	}
	public WebElement GetPayByCash() {
		return driver.findElement(PayByCash);
	}
	public WebElement GetPayOnlineByCreditCard() {
		return driver.findElement(PayOnlineByCreditCard);
	}
	public WebElement GetCreditCardOnDelivery() {
		return driver.findElement(CreditCardOnDelivery);
	}
	public WebElement GetDebitcardOnDelivery() {
		return driver.findElement(DebitcardOnDelivery);
	}
	public WebElement GetIAgreecheckBox() {
		return driver.findElement(IAgreecheckBox);
	}
	public WebElement GetPlaceOrder() {
		return PlaceOrder;
	}
	public void GetCardHoldername() {
		 CardHolderName.click();
		 CardHolderName.sendKeys("Pooja");
		 
	}
	public void GetCardNumber() {
		CardNumber.click();
		CardNumber.sendKeys("4263970000005262");
		 
	}
	public void GetinvalidCardNumber() {
		CardNumber.click();
		CardNumber.sendKeys("4263970000005262");
		 
	}
	public WebElement GetInvalidcardError() {
		return InvalidCarderrorMessage;
	}
	
	public void GetCardExpiryDate() {
		CardExpiryDate.click();
		CardExpiryDate.sendKeys("1223");
		 
	}
	public void GetCardCvv() {
		CardCvv.click();
		CardCvv.sendKeys("123");
		 
	}
	public void GetAddress() {
		StreetNo.click();
		StreetNo.sendKeys("891 pape Avenue");
		 
	}
	public void GetPostcode() {
		PostCode.click();
		PostCode.sendKeys("M4K3T9");
		 
	}
	
	public void EnterPayOnlineByCreditCardDetails() {
		GetPayOnlineByCreditCard().click();
		GetCardHoldername();
		GetCardNumber();
		GetCardExpiryDate();
		GetCardCvv();
		GetAddress();
		GetPostcode();
		
	}
	
	public void EnterPayOnlineByInValidCreditCardDetails() {
		GetPayOnlineByCreditCard().click();
		GetCardHoldername();
		GetinvalidCardNumber();
		GetCardExpiryDate();
		GetCardCvv();
		GetAddress();
		GetPostcode();
		
	}
	public void EnterGuestUserDatails() {
		guestUserFirstname.sendKeys("Pooja");
		guestUserLastname.sendKeys("Khandelwal");
		guestUserContactnumber.sendKeys("1234567890");
		guestUserEmail.sendKeys("Pooja.Khandelwal@cognizant.com");
		
	}
	
	public void RegisteredCard() {
		RegisteredCard.click();
	}

}
