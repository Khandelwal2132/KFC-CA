package pages;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BaseClass{

	public WebDriver driver;
	public WebDriverWait wait;

	public LoginPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
    @FindBy(xpath="//a[@id='btnHomeSignIn']")
	WebElement KfcSignInLink;
	@FindBy(xpath="//input[@name='Email' and @id='txtUserId']")
	private WebElement emailField;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordField ;
    @FindBy(xpath = "//button[@type='submit']" )
	private WebElement signInButton ;
    @FindBy(xpath="//span[@class='password-icon']")
	private WebElement showPasswordButton;
    @FindBy(xpath="//*[text()='Forgot Your Password?']")
	private WebElement forgotPasswordLink ;
    @FindBy(xpath="//*[@class='mat-focus-indicator mat-flat-button mat-button-base btn btn-black btn-block top btn-fb-apl ng-star-inserted']")
	private WebElement signinWithApple;
	@FindBy(xpath="//*[text()='Sign in with Google']")
	private WebElement signinWithGoogle;
	@FindBy(xpath="//li[@id='vaidationerrors' and text()='Invalid email address or password, please try again.']")
	private WebElement InvalidUserText ;
	@FindBy(xpath="//a[@href='/en/account/register' and @class='mat-ripple text-bold link-underline mat-ripple-unbounded']")
	private WebElement signUpButton;
	@FindBy(xpath="//a[@id='lnkForgotPwd']")
	private WebElement ForgetYourPassword;
	@FindBy(xpath="//input[@id='txtEmailID']")
	private WebElement ForgetYourPasswordMail;
	@FindBy(xpath="//a[text()='Submit']")
	private WebElement ForgetYourPasswordMailSubmitButton;
	
	@FindBy(xpath="//*[text()='Log Out']")	
	private WebElement logoutButton;

	public WebElement getKfcSignInLink()
	{
		return KfcSignInLink;
	}
	public WebElement getemailField()
	{
		return emailField;
	}
	public WebElement getPasswordTextBox()
	{
		return passwordField;
	}
	public WebElement getForgotPasswordlink()
	{
		return forgotPasswordLink;
	}
	public WebElement getsignInButton()
	{
		return signInButton;
	}
	public WebElement getsignUpButton()
	{
		return signUpButton; 
	}
	
	public WebElement getForgetYourPassword()
	{
		return ForgetYourPassword; 
	}
	public WebElement getForgetYourPasswordMail()
	{
		return ForgetYourPasswordMail;
		
	}
	public WebElement getForgetYourPasswordMailSubmitButton()
	{
		return ForgetYourPasswordMailSubmitButton;
	}
	
	
	
	public void loginValidIdandPass() throws InterruptedException
	{
		KfcSignInLink.click();
		emailField.sendKeys(prop.getProperty("ValidUser"));
		passwordField.sendKeys(prop.getProperty("ValidPassword"));
		Thread.sleep(1000);
		showPasswordButton.click();
		Thread.sleep(2000);
		signInButton.click();	
	}




	public void loginInvalidIdandPass() throws InterruptedException
	{
		KfcSignInLink.click();
		emailField.sendKeys(prop.getProperty("InvalidUser"));
		passwordField.sendKeys(prop.getProperty("InValidPassword"));
		Thread.sleep(1000);
		showPasswordButton.click();
		Thread.sleep(2000);
		signInButton.click();	
	}
	
	public void loginValidIdInvalidPass() throws InterruptedException
	{
		KfcSignInLink.click();
		emailField.sendKeys(prop.getProperty("ValidUser"));
		passwordField.sendKeys(prop.getProperty("InValidPassword"));
		Thread.sleep(1000);
		showPasswordButton.click();
		Thread.sleep(2000);
		signInButton.click();	
		
	}
	public void loginInvalidIdValidPass() throws InterruptedException
	{
		KfcSignInLink.click();
		emailField.sendKeys(prop.getProperty("InvalidUser"));
		passwordField.sendKeys(prop.getProperty("ValidPassword"));
		Thread.sleep(1000);
		showPasswordButton.click();
		Thread.sleep(2000);
		signInButton.click();	
	}
	public void logout() throws InterruptedException
	{
		KfcSignInLink.click();
		//Thread.sleep(2000);
		logoutButton.click();
	}
	public void AccountLockout() throws InterruptedException
	{
		KfcSignInLink.click();
		emailField.sendKeys(prop.getProperty("InvalidUser"));
		for(int a=0;a<=4;a++) 
		{
		passwordField.sendKeys(prop.getProperty("InValidPassword"));
		Thread.sleep(4000);		
		signInButton.click();	
	    }
	}
	
	


}
