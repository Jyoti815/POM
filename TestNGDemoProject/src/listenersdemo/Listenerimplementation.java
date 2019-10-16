package listenersdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimplementation implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and Test case name is: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and Test case name is: "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started and Test case name is:"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and Test case name is:"+result.getName());
	}

	
}
