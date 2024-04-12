package pages;

import java.io.IOException;
import java.time.Duration;

import java.util.List;

//import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage extends BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;

	public MenuPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}


@FindBy(xpath = "//a[@href='/menu/overview']")
private WebElement MenuButton;

@FindBy(xpath = "//a[@data-infoexp4='CAT111']")
private WebElement famousbucket;
	@FindBy(xpath = "(//a[@onclick='showLocationChangePopup()'])[1]")
	private WebElement showLocationChangePopup;
	
	@FindBy(xpath = "(//a[@onclick='changeOrderDateTime()'])")
	private WebElement changeOrderDateTime;
	@FindBy(xpath = "//a[@class='aChangeDateTime aChangeDate change']")
	private WebElement changeOrderDate;
	@FindBy(xpath = "//ul[@class='col-12 margin-top-10 text-left']/li[2]/a")
	private WebElement SelectfutureDate;
	
	@FindBy(xpath = "//a[@id='checkoutUpdateDateTime']")
	private WebElement UpdateDateTime;
	@FindBy(xpath = "//input[@onclick='DoNeedToRestartOrder()']")
	private WebElement Savechange;
	
	
	
	
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT161']")
	private WebElement KentuckyFriedFavourites;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT87']")
	private WebElement KFCFamousChickenChickenSandwich;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT110']")
	private WebElement OriginalRecipeBuckets;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT123']")
	private WebElement BigBoxMeals;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT115']")
	private WebElement SandwichCombos;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT124']")
	private WebElement OriginalRecipeChickenCombos;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT113']")
	private WebElement  BonelessChicken;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT112']")
	private WebElement  SnacksAddOns;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT10']")
	private WebElement  SidesDrinks;
	
	@FindBy(xpath = "//a[@data-infoexp4='CAT9']")
	private WebElement  Deserts;
	
	@FindBy(xpath = "//div[@class='product-name-desc']")
	private List<WebElement>  ItemDescription;
	
	@FindBy(xpath = "//button[@ng-click='addToOrder()']") 
	private List<WebElement>  AddButton;
	
	@FindBy(xpath = "//button[@ng-click='customizeItem()']")
	private List<WebElement>  CustomizeButton;
	
	@FindBy(xpath = "//*[@id=\"favItem-modal\"]/div/div/div/div[1]/div[2]")
	 WebElement  ForRegisterUserpopUpClosebutton;
	
	@FindBy(css ="div.wraperHeading ul")
	private List<WebElement> allCatagories;
	
	@FindBy(css = "div.single-box")
	private List<WebElement> allMenuItems;
	
	@FindBy(xpath="(//a[text()='START MY ORDER'])[1]")
	private WebElement starMyOrder;
	
	@FindBy(xpath="(//button[@ng-click='addToOrder()'])[30]")
	 WebElement SandwichitemR;
	@FindBy(xpath="(//button[@ng-click='addToOrder()'])[30]")
	 WebElement SandwichitemG;
	@FindBy(xpath="//button[@ng-click='addToOrder()'])[4]")
	 WebElement piecebucket;
	@FindBy(xpath="(//button[@ng-click='addToOrder()'])[4]")
	WebElement pbucket;


	@FindBy(xpath="(//button [contains(text(), 'Add')])[1]")
	 WebElement AddtoOrder;
	@FindBy(xpath="//a/div[@id='cartHeaderQty']")
	 WebElement carticon;
	@FindBy(xpath="(//a[@href='/menu/'])[2]")
	WebElement AddMoreFood;
	//By Sandwichitem=By.xpath("//div[text()='Big Crunch Sandwich Combo']");
	//By AddtoOrder=By.xpath("(//button [contains(text(), 'Add')])[1]");
	//By carticon=By.xpath("//a/div[@id='cartHeaderQty']");

	String[] itemsAddtocart= {"Boneless Bucket","4 Piece Chicken Box","10 Piece Bucket and 3 Large Sides","Sports Pack"};
	//Array to array list
	
	public WebElement getMenuButton() {
		
		return MenuButton;
	}
	public WebElement closePopUp() {
	
		return ForRegisterUserpopUpClosebutton;
	}
	
	public WebElement getSandwichcategory() {
		
		return SandwichCombos;
	}
	
public WebElement getSandwichitem()  {
		
	return SandwichitemR;
		 
	}

public WebElement pbucketfirstitem()  {
	
	return pbucket;
		 
	}
public WebElement getpiecebucket()  {
	
	return piecebucket;
		 
	}
public WebElement getSandwichitemG()  {
	
	return SandwichitemG;
		 
	}
	
		
	public WebElement addToCart() {
		//return PasswordTextBox;
		return AddtoOrder;
	}
	public WebElement GetChangelocationpopup() {
		//return PasswordTextBox;
		return showLocationChangePopup;
	}
	public WebElement GetChangeForDatetime() {
		//return PasswordTextBox;
		return changeOrderDateTime;
	}
	public WebElement GetChangeForDate() {
		//return PasswordTextBox;
		return changeOrderDate;
	}
	public WebElement Update() {
		//return PasswordTextBox;
		return UpdateDateTime;
	}
	public WebElement SaveChanges() {
		//return PasswordTextBox;
		return Savechange;
	}
	public WebElement SelectfutureDate() {
		//return PasswordTextBox;
		return SelectfutureDate;
	}
	public WebElement GetAddMoreFood() {
		
		return AddMoreFood;
	}
	
	public CartPage GoToCart() throws IOException {
		//return PasswordTextBox;
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(carticon));
		carticon.click();
		CartPage cp=new CartPage(driver);
		return cp;
	}
	 public void AddtoCart() throws InterruptedException  {
         String[] additems = {"POUTINE","POPCORN POUTINE","Big Crunch Sandwich Combo","10pc Family Feast"};
       List<WebElement> list = driver.findElements(By.xpath("//div[@class='product-name-desc']/div[1]")); 
        
       List<WebElement> list2 =driver.findElements(By.xpath("//button [@ng-click='addToOrder()']"));
System.out.println(list.size()+" "+list2.size()+" "+(list.size()==list2.size()));
       
try {    
	for(int j=0;j<additems.length;j++)
	{
		
	
			for(int i=0;i<list.size();i++)
       {
           String productname = list.get(i).getText();

           System.out.println(productname);
           System.out.println("i am in menu page"+productname.equalsIgnoreCase(additems[0]));
 try {
         if(additems[j].equalsIgnoreCase(productname))
         {  

           
            list2.get(i).click();
  
            System.out.println(list2.size());

         }
 }catch(Exception e) {
	 System.out.println("Failed because of "+e.toString());
 }
       }
	}
     }catch(Exception e) {
		System.out.println("Failed main "+e.toString());
	 }
}
	 }
	 

