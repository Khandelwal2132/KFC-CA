package extentlisteners;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

import testcases.BaseTest;
import utility.ScreenShot;

public class Listeners extends BaseTest implements ITestListener   {
	ExtentReports extent=ExtentReportGen.extentReportGenerator();
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		
		 test=extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test is passed");
		try {
			test.addScreenCaptureFromPath(ScreenShot.captureScreenshot(driver, result.getName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();		
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	test.fail(result.getThrowable());
	try {
		test.addScreenCaptureFromPath(ScreenShot.captureScreenshot(driver, result.getName()));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.getMessage();		
	}
	 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	public void reportEvent(String eventStatus,String details, boolean captureScreenshot){

		String screenShotPath = "";
		Status currentStatus = Status.INFO;
		switch (eventStatus.toUpperCase()){
			case "PASS":
				currentStatus = Status.PASS;
				break;
			case "FAIL":
				currentStatus = Status.FAIL;
				break;
			case "INFO":
				currentStatus = Status.INFO;
				break;
			case "WARNING":
				currentStatus = Status.WARNING;
				break;
		}

		if(captureScreenshot)
		{
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");

			try {
				screenShotPath = ScreenShot.captureScreenshot(driver, LocalDateTime.now().format(dateTimeFormatter).toString() + ".png");
				MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath)
						.build();
				test.log(currentStatus,details,mediaModel);
			} 
			catch(NullPointerException a)
			{
				//System.out.println("null pointer Exception");
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}else{
			test.log(currentStatus,details);
		}
	}
	
	

}
 