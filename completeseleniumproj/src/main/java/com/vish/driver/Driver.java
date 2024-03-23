package com.vish.driver;

import java.io.IOException;
import java.util.Objects;

import com.vish.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vish.constants.FrameworkConstants;

public final class Driver {
     private Driver() {}
     public static void initDriver() throws Exception {
       // System.out.println(Thread.currentThread().threadId() +" : "+ DriverManager.getDriver());
        if(Objects.isNull(DriverManager.getDriver())){
            System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirefoxDriverPath());
            DriverManager.setDriver(new FirefoxDriver());
            DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
