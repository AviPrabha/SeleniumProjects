package package2;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyTestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"Script is executing"+new Date(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"Script is Passed"+new Date(),true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"Script is Failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"Script is Skipped"+new Date(),true);
	}
	@Override
	public void onStart(ITestContext result) {
		Reporter.log(result.getName()+"Suite Execution Starts: "+new Date(),true);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Suite execution ends:"+new Date(),true);	
	}
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {	
	}
}
