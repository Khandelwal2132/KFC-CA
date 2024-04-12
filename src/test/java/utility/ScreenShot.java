package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static String captureScreenshot(WebDriver driver,String filename) throws IOException
	{
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		
	    File source =scrshot.getScreenshotAs(OutputType.FILE);
	    
	    String path=System.getProperty("user.dir")+"\\Scrshot\\"+filename+".png";
	    
	    File destination = new File(path);
	     
	    FileUtils.copyFile(source,destination);
	    return path;
	}

}
