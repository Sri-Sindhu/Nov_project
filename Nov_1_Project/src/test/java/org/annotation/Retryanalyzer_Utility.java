package org.annotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyzer_Utility implements IRetryAnalyzer { // add unimplement method

	int starting_Point = 1;
	int ending_Point = 3;

	
	public boolean retry(ITestResult result) {

		if (starting_Point <= ending_Point) {
			starting_Point++;
			return true;
		}
		return false;
	}
}
