package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterSection extends BaseClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public FooterSection(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	
public  void Aboutus() throws InterruptedException {
	
	
	WebElement About_Us = driver.findElement(By.xpath("//div[@id='collapseAbts']"));
	 List<WebElement> links= About_Us.findElements(By.tagName("a"));
	 int No_Oflinks = links.size();
	System.out.println("no of links are"+' ' +No_Oflinks);
      int count=0;
	    for (int i = 0; i< No_Oflinks; i++ ) {
	    	WebElement About_UsNew = driver.findElement(By.xpath("//div[@id='collapseAbts']"));
	   	 List<WebElement> linksNew= About_UsNew.findElements(By.tagName("a"));
	   	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	System.out.println("Link is broken");
	    	count++;
	    }
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
}
public void Customerservice() throws InterruptedException {
	WebElement Customerservice = driver.findElement(By.xpath("//div[@id='collapseCustomerServ']"));
	 List<WebElement> links= Customerservice.findElements(By.tagName("a"));
	 int No_Oflinks = links.size();
	System.out.println("no of links are"+' ' +No_Oflinks);
     int count=0;
	    for (int i = 0; i< No_Oflinks; i++ ) {
	    	WebElement CustomerserviceNew = driver.findElement(By.xpath("//div[@id='collapseCustomerServ']"));
	   	 List<WebElement> linksNew= CustomerserviceNew.findElements(By.tagName("a"));
	   	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	System.out.println("Link is broken");
	    	count++;
	    }
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
	}

public void polices() throws InterruptedException {
	WebElement polices = driver.findElement(By.xpath("//div[@id='collapsePlicies']"));
	 List<WebElement> links= polices.findElements(By.tagName("a"));
	 int No_Oflinks = links.size();
	System.out.println("no of links are"+' ' +No_Oflinks);
    int count=0;
	    for (int i = 0; i< No_Oflinks; i++ ) {
	    	WebElement policesNew = driver.findElement(By.xpath("//div[@id='collapsePlicies']"));
	   	 List<WebElement> linksNew= policesNew.findElements(By.tagName("a"));
	    	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	
	    	count++;
	    	System.out.println("Link is broken"+ count);
	    }
	    if(i!=No_Oflinks-1)
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
	}
	
public void Nutrition() throws InterruptedException {
	WebElement Nutrition = driver.findElement(By.xpath("//div[@id='collapseNutrition']"));
	 List<WebElement> links= Nutrition.findElements(By.tagName("a"));
	 int No_Oflinks = links.size();
	System.out.println("no of links are"+' ' +No_Oflinks);
   int count=0;
	    for (int i = 0; i< No_Oflinks; i++ ) {
	    	WebElement NutritionNew = driver.findElement(By.xpath("//div[@id='collapseNutrition']"));
	   	 List<WebElement> linksNew= NutritionNew.findElements(By.tagName("a"));
	   	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	System.out.println("Link is broken");
	    	count++;
	    }
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
	}
public void KFCVIP() throws InterruptedException {
	WebElement KFCVIP = driver.findElement(By.xpath("//div[@id='collapseColonelClub']"));
	 List<WebElement> links= KFCVIP.findElements(By.tagName("a"));
	 int No_Oflinks = links.size();
	System.out.println("no of links are"+' ' +No_Oflinks);
  int count=0;
	    for (int i = 0; i< No_Oflinks; i++ ) {
	    	WebElement KFCVIPNew = driver.findElement(By.xpath("//div[@id='collapseColonelClub']"));
	   	 List<WebElement> linksNew= KFCVIPNew.findElements(By.tagName("a"));
	   	linksNew.get(i).click();
	        Thread.sleep(3000);
	    String title=driver.getTitle();
	    System.out.println("title of the page is"+title);
	    if (title.contains("404")) {
	    	System.out.println("Link is broken");
	    	count++;
	    }
	   if(i==No_Oflinks-1) {
		   String currentHandle= driver.getWindowHandle();
           Set<String> windows = driver.getWindowHandles();
           for(String actual: windows)
               if(!actual.equalsIgnoreCase(currentHandle))
                   driver.switchTo().window(actual);
           driver.close();
           driver.switchTo().window(currentHandle);
	   }
		   
	   else
	    driver.navigate().back();
	    Thread.sleep(3000);
	    
	    	   }
	}

	
}
	


	   


		 




