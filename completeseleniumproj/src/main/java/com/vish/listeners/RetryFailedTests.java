package com.vish.listeners;

import com.vish.enums.ConfigProperties;
import com.vish.utils.PropertyUtils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

    private int count=0;
    private final int retries = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        boolean value = false;
        try {
            if (PropertyUtils.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
                value = count < retries;
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }
}
