package com.vish.tests;

import com.vish.reports.ExtentReport;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import com.vish.driver.Driver;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;

public class BaseTest {

    protected BaseTest(){ }

    @BeforeMethod
    protected void setUp() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    protected void tearDown(){
        Driver.quitDriver();
    }

}
