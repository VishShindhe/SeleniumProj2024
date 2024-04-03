package com.vish.driver;

import java.util.Objects;

import com.vish.enums.ConfigProperties;
import com.vish.utils.PropertyUtils;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vish.constants.FrameworkConstants;

public final class Driver {
     private Driver() {}
     public static void initDriver() throws Exception {

        if(Objects.isNull(DriverManager.getDriver())){

            System.setProperty("webdriver.gecko.driver",FrameworkConstants.getFirefoxDriverPath());
            DriverManager.setDriver(new FirefoxDriver());

            DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL).trim());
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
