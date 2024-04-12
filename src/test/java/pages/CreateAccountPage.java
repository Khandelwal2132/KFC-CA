package pages;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage extends BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;
	
	public CreateAccountPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	@FindBy(xpath="//input[@name='AccountInformation.FirstName']")
	 WebElement firstname;
	
	@FindBy(xpath="//input[@name='AccountInformation.LastName']")
     WebElement lastname;
	
	@FindBy(css="input#ContactPhone")
    WebElement contactNumber;
	
	@FindBy(xpath="//input[@name='AccountInformation.Email']")
    WebElement email;
	
	@FindBy(xpath="//input[@name='AccountInformation.Password']")
    WebElement password;
	
	@FindBy(xpath="(//input[@name='IsAgreedTermsAndConditions'])[1]")
    WebElement IAgreeCheckbox;
	
	@FindBy(xpath="//*[@id=\"profileForm\"]/div[2]/div[7]/label/span[1]")
    WebElement IAgreeVIPCheckbox;
	
	
//	@FindBy(css="input#ContactPhone")
//	private WebElement contactNumber;
	//By firstname=By.xpath("//input[@name='AccountInformation.FirstName']");
	//By lastname=By.xpath("//input[@name='AccountInformation.LastName']");
	//By contactNumber=By.cssSelector("input#ContactPhone");
	//By email=By.xpath("//input[@name='AccountInformation.Email']");
	//By password=By.xpath("//input[@name='AccountInformation.Password']");
	
	//By IAgreeCheckbox=By.xpath("(//input[@name='IsAgreedTermsAndConditions'])[1]");
	@FindBy(xpath="//input[@id='createProfileSubmit']")
    WebElement createAccount;
	@FindBy(xpath="(//a[text()='Create account'])[1]")
    WebElement createAccountLP;
	
	@FindBy(xpath="//li[text()='This email address already in use.']")
    WebElement MessageForfailedCreateaccount;
	@FindBy(xpath="//div[@class='bootstrap-dialog-message']")
    WebElement MessageForNewRegisteredUser;
	
	
	
	
	
	
	public WebElement GetFirstname() {
		return firstname;
	}
	public WebElement getcreateAccountLP() {
		return createAccountLP;
	}
	
	public WebElement GetLastname() {
		return lastname;
	}
	public WebElement GetcontactNumber() {
		return contactNumber;
	}
	public WebElement GetEmail() {
		return email;
	}
	public WebElement GetPassword() {
		return password;
	}
	public void GetIAgreeCheckbox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", IAgreeCheckbox );
		}
	
	public void GetIAgreeVIPCheckbox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", IAgreeVIPCheckbox );
		}
	
	public void GetCreateAccount() {
		createAccount.click();
	}
//	public void Getmessage() {
//		if(Message.isDisplayed()) {
//			System.out.println(Message.getText());
//		 if(Message.getText().equalsIgnoreCase("This email address already in use.")) {
//			 System.out.println("");
//		 }
//			
//		}else {
//			System.out.println("User successfully registered");
//		}
//	}
	public WebElement GetMessageForfailedCreateaccount() {
		return MessageForfailedCreateaccount;
	}
	public WebElement GetMessageForNewRegisteredUser() {
		return MessageForNewRegisteredUser;
	}
	
}
