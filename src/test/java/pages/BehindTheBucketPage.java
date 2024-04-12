package pages;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BehindTheBucketPage extends BaseClass{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BehindTheBucketPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	
	@FindBy (xpath ="//a[@href='/behind-the-bucket']")
	 WebElement BehindTheBucket;
	@FindBy (xpath ="(//button[@id='nav-chicken-tab'])[1]")
	 WebElement OurFood;
	@FindBy (xpath ="//button[@id='nav-planet-tab']")
	 WebElement OurPlanet;
	@FindBy (xpath ="//button[@id='nav-people-tab']")
	 WebElement OurPeople;
	@FindBy (xpath ="(//button[@data-target='#nav-planet'])[3]")
	 WebElement ArrowButton;
	

	public WebElement getBehindTheBucket()
	{
		return BehindTheBucket;		
	}
	public WebElement getOurFood()
	{
		return OurFood;		
	}
	public WebElement getOurPlanet()
	{
		return OurPlanet;		
	}
	public WebElement getOurPeople()
	{
		return OurPeople;		
	}
	public WebElement getArrowButton()
	{
		return ArrowButton;		
	}
	

}
