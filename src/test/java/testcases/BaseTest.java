package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AdminPage;
import pages.BannersPage;
import pages.BehindTheBucketPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.CreateAccountPage;
import pages.FooterSection;
import pages.HeaderSection;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.MyAccountPage;
import pages.OrderConfirmationPage;



public class BaseTest {
	public static WebDriver driver;
	public HomePage hp;
	public HeaderSection hs;
	public FooterSection fs;
	public LoginPage lp;
	public BannersPage bp;
	public CartPage cp;
	public CheckoutPage chp;
	public MenuPage mp;
	public AdminPage ap;
	public OrderConfirmationPage ocp;
	public BehindTheBucketPage btb;
	public CreateAccountPage cap;
	public MyAccountPage map;

	public Properties prop;
	public WebDriverWait wait;
	public void initDriver() throws IOException
	{
		prop= new Properties();
		String filepath=System.getProperty("user.dir")+"\\Config.properties";
		FileInputStream fis= new FileInputStream(filepath);
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().browserVersion("115").setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--start-maximized");
//			options.addArguments("--incognito");
//			options.addArguments("--disable-notification");
//			options.addArguments("--headless");
			driver= new ChromeDriver(options);
			
		}
		else if(browser.equals("edge"))
		{
	
			EdgeOptions options = new EdgeOptions();
			driver= new EdgeDriver(options);
			driver.manage().window().maximize();
			
			
		}
		else if(browser.equals("firefox"))
		{
			
		}
		driver.navigate().to(prop.getProperty("url"));
	}
	@BeforeClass
	public void createObject() throws IOException
	{
		
		initDriver();
        hp=new HomePage(driver);
        lp= new LoginPage(driver);
        bp= new BannersPage(driver);
        btb= new BehindTheBucketPage(driver);
        hs= new HeaderSection(driver);
        fs= new FooterSection(driver);
        mp= new MenuPage(driver);
        cp= new CartPage(driver);
        chp= new CheckoutPage(driver);
        ocp=new OrderConfirmationPage(driver);
        ap= new AdminPage(driver);
        cap= new CreateAccountPage(driver);
        map= new MyAccountPage(driver);
        
       
	}
	@BeforeMethod
	public void waits()
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	@AfterSuite
	public void teardown()
	{
		//driver.quit();
	}
	

}
