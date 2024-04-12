package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public AdminPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	@FindBy (xpath ="//input[@id='Email']")
	 WebElement AdminEmailID;
	
	@FindBy (xpath ="//input[@id='Password']")
	 WebElement AdminPassword;
	
	@FindBy (xpath ="//button[@type='submit']")
	 WebElement AdminSigninButton;
	
	@FindBy (xpath ="//a[@href='https://kfccanadaadmin-dev.cognizantorderserv.com/']")
	 WebElement OloAdmin;
	
	@FindBy (xpath ="//a[@id='orderReport']")
	 WebElement ViewDetail;
	
	
	@FindBy (xpath ="//input[@id='OrderTrackingNumber']")
	 WebElement AdminOrderNumber;
	
	@FindBy (xpath ="//button[@type='button' and @class='btn btn-primary btn-block btnSubmit']")
	 WebElement GenerateReport;
	
	/*@FindBy (xpath ="(//span[@class='fa fa-sort sort-icon'])[3]")
	 WebElement SortDate;
	 */
	
	@FindBy (xpath ="(//a[@href='javascript:return void(0);'])[1]")
	 WebElement OrderNumber;
	 
	public void AdminSignin()
	{
		AdminEmailID.sendKeys("admin@kfccanada.com");
		AdminPassword.sendKeys("kfc@Twenty20!");
		AdminSigninButton.click();
	}
	
	public void AdminValidation() throws InterruptedException
	{
		OloAdmin.click();
	//	OrderDetails.click();
	//	wait.until(ExpectedConditions.elementToBeClickable(ViewDetail));
	//	Thread.sleep(10000);
		ViewDetail.click();		
	}
	
	public WebElement getAdminOrderNumber()
	{
		return AdminOrderNumber;
		
	}
	public WebElement getGenerateReport()
	{
		return GenerateReport;		
	}
	
	public WebElement getOrderNumber()
	{
		return OrderNumber;		
	}
}
