package testNGITestListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnerExample implements ITestListener {
	
	@Override
	public void onStart(ITestContext result) {
		System.out.println(" In on start method of ITestListner. Test name is " + result.getName());
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println(" In on Test start method of ITestListner. Test name is " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(" In on Test Sucesss method of ITestListner. Test name is " + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(" In on Test Failure method of ITestListner. Test name is " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(" In on Test Sipped method of ITestListner. Test name is " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(" In on Test Failed with sucesss percentage method of ITestListner. Test name is " + result.getMethod().getMethodName());
	}

	public void onFinish(ITestResult result) {
		System.out.println(" In on Test on Finish method of ITestListner. Test name is " + result.getName());
	}

}
