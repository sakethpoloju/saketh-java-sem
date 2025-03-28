package sakethh;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 public class Itestliss implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// if test pass 
		System.out.println("************** pass**********");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("############## fail##############");
		// if test fail

	
	}
	}

