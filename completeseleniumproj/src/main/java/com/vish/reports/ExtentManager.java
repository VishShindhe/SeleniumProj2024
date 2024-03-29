package com.vish.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {

    private ExtentManager() {}

    private final static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

    public static ExtentTest getExtentTest() {
        return extTest.get();
    }

    public static void setExtentTest(ExtentTest test) {
        extTest.set(test);
    }

    public static void unload() {
        extTest.remove();
    }
}
