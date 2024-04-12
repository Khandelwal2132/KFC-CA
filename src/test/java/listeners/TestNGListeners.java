package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testcases.BaseTest;
import utility.ScreenShot;

public class TestNGListeners extends BaseTest implements ITestListener {

	
	@Override
		public void onTestStart(ITestResult result) {
	    	 System.out.println("Test started:  "+result.getName());
	     }
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed:  "+result.getName());	
		
	}
	@Override
	 public void onTestFailure(ITestResult result)
     {
    	 System.out.println("Opps! Test case Failded:  "+result.getName()+" Please Check Screenshot");
    	 try {
			ScreenShot.captureScreenshot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
     
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped:  "+result.getName());
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Test cases are getting started:  "+context.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test cases got executed:  "+context.getName());
		
		
	}
	
    
}
