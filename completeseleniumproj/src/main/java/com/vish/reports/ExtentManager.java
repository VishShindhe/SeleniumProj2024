package com.vish.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {

    private ExtentManager() {}

    private final static ThreadLocal<ExtentTest> extTest = new ThreadLocal<>();

    // default access modifier --> can be accessed within the package
    static ExtentTest getExtentTest() {
        return extTest.get();
    }

    static void setExtentTest(ExtentTest test) {
        extTest.set(test);
    }

    static void unload() {
        extTest.remove();
    }
}
