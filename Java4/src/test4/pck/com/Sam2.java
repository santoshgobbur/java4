package test4.pck.com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sam2 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("hi");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Passed Test case name is : ");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Tese case name is : ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped Test case name is : ");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
