package extentlisteners;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	static ExtentReports extent;
	 
	public static ExtentReports extentReportGenerator()
	{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
		String path=System.getProperty("user.dir")+"//reports//"+LocalDateTime.now().format(dateTimeFormatter).toString()+"KFCCAReport.html";	
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(path);	
		reporter.config().setReportName("KFCCA_AutomationReport");		
    	reporter.config().setTheme(Theme.DARK);		
	    extent = new ExtentReports();	
		extent.attachReporter(reporter);	
		//extent.setSystemInfo("Browser name","Chrome Version 108");	
		extent.setSystemInfo("OS","Windows 11");
		extent.setSystemInfo("Tester","QA Team Canada");
		return extent;
		
		
	}
	

}
