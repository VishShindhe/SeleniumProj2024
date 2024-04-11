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
import java.util.Map;

public class BaseTest {

    protected BaseTest(){ }

    @BeforeMethod
    protected void setUp(Object[] data) throws Exception {
        Map<String,String> map = (Map<String, String>)data[0];
        Driver.initDriver(map.get("browser"));
    }

    @AfterMethod
    protected void tearDown(){
        Driver.quitDriver();
    }

}
