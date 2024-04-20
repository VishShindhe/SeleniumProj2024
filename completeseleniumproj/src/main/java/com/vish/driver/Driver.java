package com.vish.driver;

import java.util.Objects;

import com.vish.enums.ConfigProperties;
import com.vish.utils.PropertyUtils;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.vish.constants.FrameworkConstants;

public final class Driver {
     private Driver() {}
     public static void initDriver(String browser) throws Exception {
        if(Objects.isNull(DriverManager.getDriver())){
            if(browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", FrameworkConstants.getFirefoxDriverPath());
                DriverManager.setDriver(new FirefoxDriver());

            }

            /* Add for other browsers
            else if(browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
                DriverManager.setDriver(new ChromeDriver());
            }
             */

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
