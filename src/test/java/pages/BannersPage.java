package pages;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BannersPage extends BaseClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BannersPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	

	
	@FindBy (xpath ="//*[@id='RenderBodyDiv']/div[9]/div[1]/a")
	 WebElement fristbanner;
	@FindBy (xpath ="//*[@id='RenderBodyDiv']/div[9]/div[2]/a")
	 WebElement secondbanner;
	@FindBy (xpath ="//*[@id='RenderBodyDiv']/div[9]/div[3]/a")
	 WebElement thirdbanner;
	@FindBy (xpath ="//*[@id='RenderBodyDiv']/div[9]/div[4]/a")
	 WebElement fourthbanner;
	@FindBy (xpath ="//*[@id='RenderBodyDiv']/div[9]/div[5]/a")
	 WebElement fifthbanner;
	
	
	@FindBy (xpath="//div[@class='defaultHomeCarousel homeCarousel']")
	WebElement Bannersection;
	public void ClickOnEachBanner() {
		List<WebElement> Banners=Bannersection.findElements(By.tagName("a"));
		int NoofBanners=Banners.size();
		System.out.println("no of banners are"+ NoofBanners );
		
	}
	
	public void GetBanner() {
		
		if(fristbanner.isEnabled())
			System.out.println("Banner is present");
		fristbanner.click();
		String title=driver.getTitle();
		System.out.println("title of the page is"+title);
		 driver.navigate().back();
	}
public void GetBanner2() {
		
		if(secondbanner.isEnabled())
			System.out.println("Banner is present");
		secondbanner.click();
		String title=driver.getTitle();
		System.out.println("title of the page is"+title);
		 driver.navigate().back();
	}
public void GetBanner3() throws InterruptedException {
	
	if(thirdbanner.isEnabled())
		System.out.println("Banner is present");
	Thread.sleep(3000);
	thirdbanner.click();
	String title=driver.getTitle();
	System.out.println("title of the page is"+title);
	 driver.navigate().back();
}
public void GetBanner4() {
	
	if(fourthbanner.isEnabled())
		System.out.println("Banner is present");
	fourthbanner.click();
	String title=driver.getTitle();
	System.out.println("title of the page is"+title);
	 driver.navigate().back();
}
public void GetBanner5() {
	
	if(fifthbanner.isEnabled())
		System.out.println("Banner is present");
	fifthbanner.click();
	String title=driver.getTitle();
	System.out.println("title of the page is"+title);
	 driver.navigate().back();
}
}
