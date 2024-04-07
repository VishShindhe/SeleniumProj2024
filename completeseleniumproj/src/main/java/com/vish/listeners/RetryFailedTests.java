package com.vish.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

    private int count=0;

    @Override
    public boolean retry(ITestResult iTestResult) {
        int retries = 1;
        boolean value = count < retries;
        count++;
        return value;
    }
}
