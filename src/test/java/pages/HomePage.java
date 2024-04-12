package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends BaseClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public HomePage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	@FindBy(xpath = "(//a[@href=\"/login\"])[1]")
	private WebElement loginLink;
	
	@FindBy(css = "[href='/myaccount']")
	private WebElement myAccountLink;
	
	
	@FindBy(xpath = "//span[@data-gtm-event-action='Logo']")
	 WebElement HomePage_KfcLogoIcon ;
	
	@FindBy(xpath="//a[@href='/menu/overview']")
	 WebElement HomePage_menuButton;
	
	@FindBy(xpath="//a[@href='/menu/deals']")
	 WebElement Homepage_DealsButton ;
	 
	@FindBy(xpath="(//a[@href='/find-a-kfc'])[1]")
	 WebElement HomePage_FindAKfcButton ;
	
	@FindBy(css="#cartHeaderQty")
	 WebElement HomePage_Cartbutton ;
	
   @FindBy(xpath="//a[@id='btnHomeSignIn']")
    WebElement Homepage_KfcSignInLink;

	
	@FindBy(css="#aLanguage")
	 WebElement HomePage_KfcFranchaiselink ;
	
	@FindBy(css="a.auth-link.headerLinkKfcVIP")
	 WebElement HomePage_KfcVipLink ;
	
	@FindBy(css="#home-tab")
	 WebElement HomePage_DeliveryButton ;
	
	@FindBy(xpath="//a[@id='linkShowLocationSearchDelivery']")
	private WebElement HomePage_SearchBoxLinkDelivery;
	
	@FindBy(xpath="//a[@id='linkShowLocationSearchPickup']")
	private WebElement HomePage_SearchBoxLinkPickup;
	
	@FindBy(css="#RestaurantSearchKeywordDelivery")
	 WebElement HomePage_DeliveryLocationSearchBox ;
	
	@FindBy(xpath="//input[@id='txtPassCode']")
	 WebElement auth_PassCodeField;
	
	
	
	@FindBy(xpath="(//div[@class=\"defaultHomeCarousel homeCarousel\"]/a/picture/img)[1]")
	 WebElement HomePage_Banner1 ;
	@FindBy(xpath="(//div[@class=\"defaultHomeCarousel homeCarousel\"]/a/picture/img)[2]")
	 WebElement HomePage_Banner2 ;
	@FindBy(xpath="(//div[@class=\"defaultHomeCarousel homeCarousel\"]/a/picture/img)[3]")
	 WebElement HomePage_Banner3 ;
			
	@FindBy(xpath="(//div[@class=\"defaultHomeCarousel homeCarousel\"]/a/picture/img)[4]")
	 WebElement HomePage_Banner4 ;
	@FindBy(xpath="(//div[@class=\"defaultHomeCarousel homeCarousel\"]/a/picture/img)[5]")
	 WebElement HomePage_Banner5 ;
			
	@FindBy(css="a#profile-tab")
	 WebElement HomePage_pickupButton;
	
	@FindBy(css="#RestaurantSearchKeywordCarryout")
	 WebElement HomePage_pickupLocationSearch;
	
	
	@FindBy(xpath="//div[text()='Welcome Back, Pooja!']")
	 WebElement HomePage_Welcometext;
	
	@FindBy(css="input#delivery-submit")
	 WebElement HomePage_ConfirmButton;
	
	@FindBy(css="#btnForDelivery")
	 WebElement preOrderForDelivery;
	@FindBy(xpath="(//span[@class='cheveron'])[2]")
	 WebElement PickupStoreArrow;
	
	@FindBy(xpath="//button[contains(@data-gtm-event-action ,'891 Pape Ave   Toronto M4K 3T9')]")
	 WebElement PickupStoreForRegisterUser;
	@FindBy(xpath="//button[contains(@data-gtm-event-action ,'891 Pape Ave   Toronto M4K 3T9')]")
	 WebElement PickupStoreForGuestUser;
	@FindBy(xpath="(//a[@href=\"/find-a-kfc\"])[1]")
	 WebElement Home_FindAKFC;
	
	//Register user
	By seeAllAddressForDelivery=By.xpath("//div[@id='delivery']/p[3]/a[text()= ' See All']");
	By seeAllAddressForPickup=By.xpath("//div[@id='pickup']/p[3]/a[text()= ' See All']");
	By savedAddress=By.xpath("//div[@id='savedAddressPopup']/ul/li[1]/a");
	By dateChange=By.xpath("//a[@data-gtm-event-action='Date']");
	By dateSelect=By.xpath("//div[@class='date-chooser-container col-12']/ul/li/a");
	By timeChange=By.xpath("//a[@data-gtm-event-action='Time']");
	By timeSelect=By.xpath("//ul[@class='col-12 margin-top-10 timeselectionoptions text-left']/li[3]");
	@FindBy(xpath="//a[text()='891 Pape Avenue Toronto, Ontario, East York M4K 3T9']")
	WebElement savedaddressalohastore;
	@FindBy(xpath="(//a[text()='891 Pape Avenue Toronto, Ontario, East York M4K 3T9 '])[1]")
	WebElement savedaddressalohastoreDelivery;
	//By preOrderForDelivery=By.cssSelector("#btnForDelivery");
	@FindBy(xpath="//a[@class='active langbar']")
	WebElement LanguageChange;
	
	public void authentication()
	{
		auth_PassCodeField.sendKeys("AaBcXYyz$1@kJ63%");
		auth_PassCodeField.sendKeys(Keys.ENTER);
	}
	
	public WebElement GetSeeAllLinkForDelivery() {
		return driver.findElement(seeAllAddressForDelivery);
	}
	public WebElement GetSavedaddressAlohaStore()
	{
		return savedaddressalohastore;
	}
	public WebElement GetSavedaddressAlohaStoreDelivery()
	{
		return savedaddressalohastoreDelivery;
	}
	public WebElement GetSeeAllLinkForpickup() {
		return driver.findElement(seeAllAddressForPickup);
	}
	public WebElement GetSavedAddress () {
	return driver.findElement(savedAddress);	
	}
	public WebElement GetdateChange () {
		return driver.findElement(dateChange);	
		}
	public WebElement GetdateSelect () {
		return driver.findElement(dateSelect);	
		}
	public WebElement GettimeChange () {
		return driver.findElement(timeChange);	
		}
	public WebElement GettimeSelect () {
		return driver.findElement(timeSelect);	
		
		}
	public WebElement FindAKFC() {
		return Home_FindAKFC;	
		
		}
	public WebElement GetLanguageChange() {
		return LanguageChange;
	}
	


//	public MenuPage clickMenutab()  {
//		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//	//WebElement menuButton=	wait.until(ExpectedConditions.elementToBeClickable(HomePage_menuButton));
//		//waitForObjectVisible(By.xpath(""));
//		//wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage_menuButton));
//		HomePage_menuButton.click();
//			MenuPage mp=new MenuPage(driver);
//			return mp;
//			}
	
	public WebElement clickDealstab()  {
		
			return Homepage_DealsButton;
		
		
	}

	public WebElement getWelcomtext() {
		
		return HomePage_Welcometext;
	}
	
	public void SelectDeliveryLocation() throws InterruptedException {
		HomePage_DeliveryButton.click();
		HomePage_DeliveryLocationSearchBox.sendKeys(prop.getProperty("SotreId"));
		HomePage_DeliveryLocationSearchBox.sendKeys(Keys.DOWN);
		
		HomePage_DeliveryLocationSearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		HomePage_ConfirmButton.click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("PRE-ORDER FOR DELIVERY"))
		{
			preOrderForDelivery.click();
		}

		
	
	}
	public void SelectPickupLocation() throws InterruptedException {
		HomePage_pickupButton.click();
		HomePage_pickupLocationSearch.sendKeys(prop.getProperty("SotreId"));
		Thread.sleep(2000);
		HomePage_pickupLocationSearch.sendKeys(Keys.DOWN);
		HomePage_pickupLocationSearch.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", PickupStore );
		PickupStoreForGuestUser.click();
	}
	public void SelectPickupLocationForFutureOrder() throws InterruptedException {
		HomePage_pickupButton.click();
		HomePage_pickupLocationSearch.sendKeys(prop.getProperty("SotreId"));
		Thread.sleep(2000);
		HomePage_pickupLocationSearch.sendKeys(Keys.DOWN);
		HomePage_pickupLocationSearch.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", PickupStore );
		PickupStoreForGuestUser.click();
	}
	public void SelectPickupLocationForRegisteruser() throws InterruptedException {
		HomePage_pickupButton.click();
		HomePage_SearchBoxLinkPickup.click();
		HomePage_pickupLocationSearch.sendKeys(prop.getProperty("SotreId"));
		Thread.sleep(2000);
		HomePage_pickupLocationSearch.sendKeys(Keys.DOWN);
		HomePage_pickupLocationSearch.sendKeys(Keys.ENTER);	
		Thread.sleep(2000);
		PickupStoreForGuestUser.click();


	}	
	
	
	public void SelectDeliveryLocationForRegisteruser() {
		HomePage_DeliveryButton.click();
		HomePage_SearchBoxLinkDelivery.click();
		HomePage_DeliveryLocationSearchBox.sendKeys(prop.getProperty("SotreId"));
		HomePage_DeliveryLocationSearchBox.sendKeys(Keys.DOWN);
		HomePage_DeliveryLocationSearchBox.sendKeys(Keys.ENTER);
		HomePage_ConfirmButton.click();
		preOrderForDelivery.click();
	
	}
 	
 
 	
	
	
	
	
	
	
	
	

}
