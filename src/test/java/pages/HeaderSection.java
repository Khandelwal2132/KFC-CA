package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderSection extends BaseClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public HeaderSection(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
public void Headlinks() throws InterruptedException {
	WebElement Headerlink = driver.findElement(By.xpath("//header[@id='header-wrap']"));
	List<WebElement> link=Headerlink.findElements(By.tagName("a"));
	int available_links= link.size();
	System.out.println("count is"+ available_links);
	int count =0;
	 for (int i = 0; i< available_links; i++ ) {
	    	WebElement HeaderlinkNew = driver.findElement(By.xpath("//header[@id='header-wrap']"));
	   	 List<WebElement> linksNew= HeaderlinkNew.findElements(By.tagName("a"));
	   	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	System.out.println("Link is broken");
	    	count++;
	    }else if(title.contains("Login")){
	  System.out.println("User is GuestUser");
	    	
	    }else {
	    	System.out.println("User is Registered user");
	    }
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
}
	
public void headbartabsClick() throws InterruptedException {
	WebElement Headertabs = driver.findElement(By.xpath("//div[@id='stickyCartHeader']"));
	List<WebElement> tabs=Headertabs.findElements(By.tagName("a"));
	int available_tabs= tabs.size();
	System.out.println("count is"+ available_tabs);
	int count =0;
	 for (int i = 0; i< available_tabs-1; i++ ) {
	    	WebElement HeaderlinkNew = driver.findElement(By.xpath("//div[@id='stickyCartHeader']"));
	   	 List<WebElement> linksNew= HeaderlinkNew.findElements(By.tagName("a"));
	   	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	System.out.println("Link is broken");
	    	count++;
	    }
	   // driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
	 
	 
}

}

	


