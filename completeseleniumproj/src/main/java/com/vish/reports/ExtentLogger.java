package com.vish.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.vish.enums.ConfigProperties;
import com.vish.utils.PropertyUtils;
import com.vish.utils.ScreenshotUtils;


public final class ExtentLogger {

    private ExtentLogger() {}

    public static void pass(String message) {
       ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message) {
        ExtentManager.getExtentTest().fail(message);
    }

    public static void skip(String message) {
        ExtentManager.getExtentTest().skip(message);
    }

    public static void pass(String message, boolean isScreenShotNeeded) throws Exception{
        if(PropertyUtils.get(ConfigProperties.PASSEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") && isScreenShotNeeded ){
            ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        }
        else {
            pass(message);
        }
    }

    public static void fail(String message, boolean isScreenShotNeeded) throws Exception{
        if(PropertyUtils.get(ConfigProperties.FAILEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") && isScreenShotNeeded ){
            ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        }
        else {
            fail(message);
        }
    }

    public static void skip(String message, boolean isScreenShotNeeded) throws Exception{
        if(PropertyUtils.get(ConfigProperties.SKIPPEDSTEPSSCREENSHOT).equalsIgnoreCase("yes") && isScreenShotNeeded ){
            ExtentManager.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        }
        else {
            skip(message);
        }
    }



}
