package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreSelection extends BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;

	public StoreSelection(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	By seeAllAddress=By.xpath("//div[@id='delivery']/p[3]/a[text()= ' See All']");
	By savedAddress=By.xpath("//div[@id='savedAddressPopup']/ul/li[1]/a");
	By dateChange=By.xpath("//a[@data-gtm-event-action='Date']");
	By dateSelect=By.xpath("//div[@class='date-chooser-container col-12']/ul/li/a");
	By timeChange=By.xpath("//a[@data-gtm-event-action='Time']");
	By timeSelect=By.xpath("//ul[@class='col-12 margin-top-10 timeselectionoptions text-left']/li[3]");
	By preOrderForDelivery=By.cssSelector("#btnForDelivery");
	
	
	public WebElement GetSeeAllLink() {
		return driver.findElement(seeAllAddress);
	}
	public WebElement GetSavedAddress () {
	return driver.findElement(savedAddress);	
	}
	public WebElement GetdateChange () {
		return driver.findElement(dateChange);	
		}
	public WebElement GetdateSelect () {
		return driver.findElement(dateSelect);	
		}
	public WebElement GettimeChange () {
		return driver.findElement(timeChange);	
		}
	public WebElement GettimeSelect () {
		return driver.findElement(timeSelect);	
		
		}
	public WebElement preOrderForDelivery() {
		
		return driver.findElement(preOrderForDelivery);	
		
		}

	public void SelectPickupLocation() {
		
	}
	

}
