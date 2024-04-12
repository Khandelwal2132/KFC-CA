package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderConfirmationPage extends BaseClass{
	
	public WebDriver driver;
	public WebDriverWait wait;

	public OrderConfirmationPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
	@FindBy(xpath = "(//button[text()='Close'])[1]")
	
	private WebElement favoriteOrderPopupclosebutton;
	@FindBy(xpath = "//th/b")
	WebElement TotalAmount;
	
	@FindBy(xpath = "(//button[@class='btn btn-block'])[2]")
	WebElement PopUpClose;
	
	@FindBy(xpath = "//div/h5")
	WebElement OrderNumber;
	
	public WebElement getOrderNumber() {
		return OrderNumber;
	}
	public WebElement getPopUpClose() {
		return PopUpClose;
	}
	
	public WebElement getTotalAmount() {
		return TotalAmount;
	}
	public WebElement getclose() {
		return favoriteOrderPopupclosebutton;
	}
	
	
}
