package utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		WebDriverManager.chromedriver().browserVersion("111").setup();
		ChromeOptions options= new ChromeOptions();	
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://kfccanada-uat.cognizantorderserv.com/");
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("NO of Links="+links.size());
		
	    for(int i=0;i<links.size();i++)
	    {
			WebElement element=links.get(i);
		String url=	element.getAttribute("href");// getting required link
		
		
		URL link;
		try {
			link = new URL(url);
			HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
            //Connect is the method to connection
httpConn.connect();
int responseCode=httpConn.getResponseCode();

if(responseCode>=400)
{
	System.out.println(url +"-"+"is broken link");
}
else
{
	System.out.println(url +"-"+"is valid link");
}

		} 
		catch (MalformedURLException e)
		{
			
			
		}
		catch(Exception e)
		{
			
		}
	
	}	
	   // driver.quit();
	}
	

}
