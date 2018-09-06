package testNGFailedTestRerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRerun implements IRetryAnalyzer {

	private int retryCount = 0;
	private int maxRetryCount = 2;

	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			 System.out.println("Retrying test " + result.getName() + " with status "
	                    + getResultStatus(result.getStatus()) + " for the " + (retryCount+1) + " time.");
			retryCount++;
			return true;
		}
		return false;

	}

	public static String getResultStatus(int status) {
		String resultStatus = null;

		if (status == 1)
			resultStatus = "SUCCESS";
		if (status == 2)
			resultStatus = "FAILURE";
		if (status == 3)
			resultStatus = "SKIP";

		return resultStatus;

	}

}
