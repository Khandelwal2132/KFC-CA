package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DealsPage extends BaseClass{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public DealsPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}

@FindBy(css = "a.ng-binding.active")
private WebElement LimitedTimeOffers;

@FindBy(xpath = "//a[@class='ng-binding']")
private WebElement ExclusiveOnlineDeals;

@FindBy(xpath = "(//a[@href='/coupons'])[1]")
private WebElement Coupons;

@FindBy(xpath = "//button[@ng-click='addToOrder()']")
private List<WebElement>  AddButton;

@FindBy(xpath = "//button[@ng-click='customizeItem()']")
private List<WebElement>  CustomizeButton;

@FindBy(css = "div.single-box")
private List<WebElement> allDealsItems;

@FindBy(xpath = "//div[@class='product-name-desc']")
private List<WebElement>  ItemDescription;

}
