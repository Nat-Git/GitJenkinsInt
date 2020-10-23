package retailPSA.RetailMaven;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ListenerTest implements ITestListener {
	
ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Sol O2C Test Execution Report.html");
	
ExtentReports extent = new ExtentReports();

	public void onTestStart(ITestResult result) {
		System.out.println("Name of the Started test case is "+result.getName());	
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the Passed test case is "+result.getName());	
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest(result.getName()+"  functionality");
		test.pass(result.getName()+"  functionality  is  tested  OK");
		extent.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the Failed test case is "+result.getName());	
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest("Failed Test");
		test.fail(result.getName()+"  functionality is failed");
		extent.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the Skipped test case is "+result.getName());	
		extent.attachReporter(htmlReporter);
		ExtentTest test = extent.createTest(result.getName()+"  functionality");
		test.skip(result.getName()+"  Method is Skipped");
		extent.flush();
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
