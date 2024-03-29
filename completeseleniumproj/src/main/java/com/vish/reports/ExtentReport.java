package com.vish.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vish.constants.FrameworkConstants;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){ }

    private static ExtentReports extent;

    public static void initReports() throws Exception {
        if(Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentreportfilepath());
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Orange Report");
            spark.config().setReportName("SeleniumTest");
        }
    }

    public static void flushReports() throws Exception {
        if(Objects.nonNull(extent)) {
            extent.flush();
        }
        Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentreportfilepath()).toURI());

    }

    public static void createTest(String testcasename) {
        ExtentManager.setExtentTest(extent.createTest(testcasename));

    }
}
