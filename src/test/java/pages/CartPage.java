package pages;

import java.util.List;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;

	public CartPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}

	@FindBy(css="div.order-summary__items ")
	private List<WebElement> itemListInCart;
	
	@FindBy(css="div.itemName.ng-binding")
	private List<WebElement> itemNameListInCart;
	
	@FindBy(css="#aRemoveItem")
	private List<WebElement> itemRemoveLinksListInCart;
	
	@FindBy(xpath="//span[@ng-if='!item.IsLoyaltyItem']")
	private List<WebElement> itemPriceListInCart;
	
	@FindBy(css="div.incrementer .js-dec")
	private List<WebElement> itemDecreaseButtons;
	
	@FindBy(css="div.incrementer .js-dec")
	private WebElement itemDecreaseButton;
	
	@FindBy(css="div.incrementer .js-inc")
	private List<WebElement> itemIncreaseButtons;
	
	@FindBy(css="div.incrementer .js-inc")
	private WebElement itemIncreaseButton;
	
	
	@FindBy(css="div.incrementer input")
	private List<WebElement> itemQuantityCount;
	
	@FindBy (xpath="//input[@placeholder='Coupon code']")
	private WebElement CouponBox;
	
	@FindBy (xpath="//button[text()='Apply']")
	private WebElement CouponApplybutton;
	
	@FindBy (xpath="//div[text()='This coupon code is invalid.']")
	private WebElement Invalidcoupontext;
	
	@FindBy(css="div.d-md-block p.price-row.carttotal span.small-price")
	private WebElement totalPriceInCart;
	
	@FindBy(xpath="(//p[@ng-if=\"orderMode=='2'\"]/ span[@class=\"ng-binding\"])[2]")
	private WebElement deliveryChargeInCart;
	
	@FindBy(xpath="(//p[@class='price-row']/span[@class='small-price bebasPrice ng-binding'])[1]")
	private WebElement subtotalPriceInCart;
	
	
	@FindBy(css="[ng-model='couponCode']")
	private WebElement couponTextBox;
	
	@FindBy(css="button.coupon-apply-btn")
	private WebElement couponApplyButton;
	
	
	
	@FindBy(xpath="(//a[text()='PROCEED TO CHECKOUT'])[3]")
	private WebElement ProceedToCheckOutButton;
	
	@FindBy(xpath="(//a[@href='/menu/'])[3]")
	private WebElement addMoreFood;
	
	@FindBy(xpath="//a[text()='edit']")
	private List<WebElement> Editbutton;
	//---------------------------------
	
	@FindBy(xpath="//*[@id=\"8de558f0-6372-4ac7-ac48-e9f0c87a80d6\"]/div/div/div[2]/div/div/div")
	private WebElement Above_10;
	
	//-----------------------------------
	
	
	
	public List<WebElement> GetEditbutton() {
		return Editbutton;
	}
	public List<WebElement> GetplusButton() {
		return itemIncreaseButtons ;
	}
	public WebElement GetsingleplusButton() {
		return itemIncreaseButton ;
	}
	public List<WebElement> GetMinusButton() {
		return itemDecreaseButtons;
	}
	public WebElement GetsingleMinusButton() {
		return itemDecreaseButton;
	}
	public WebElement GetAddMoreFood() {
		return addMoreFood;
	}
	public WebElement GetCouponBox() {
		return couponTextBox;
	}
	public WebElement GetApplybutton() {
		return couponApplyButton;
	}
	public WebElement GetCouponErrorText() {
		return Invalidcoupontext;
	}
	
	//----------------------
	public WebElement GetCouponErrorText1() {
		return Above_10;
	}
	//-----------------------
	public CheckoutPage GetProceedToCheckout() throws IOException {
		wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckOutButton));
		ProceedToCheckOutButton.click();
		 CheckoutPage chp=new CheckoutPage(driver);
		 return chp;
	
	}
	
	
	
}
