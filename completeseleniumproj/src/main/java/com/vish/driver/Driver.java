package com.vish.driver;

import java.net.URL;
import java.util.Objects;

import com.vish.enums.ConfigProperties;
import com.vish.utils.PropertyUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.vish.constants.FrameworkConstants;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class Driver {
     private Driver() {}
     public static void initDriver(String browser) throws Exception {
         String runMode = PropertyUtils.get(ConfigProperties.RUNMODE);
        if(Objects.isNull(DriverManager.getDriver())){
            if(browser.equalsIgnoreCase("firefox")) {
                if(runMode.equalsIgnoreCase("remote")) {
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setBrowserName("firefox");
                    DriverManager.setDriver(new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), cap));
                }
                DriverManager.setDriver(new FirefoxDriver());
            }
            else if(browser.equalsIgnoreCase("chrome")) {
                if(runMode.equalsIgnoreCase("remote")) {
                    DesiredCapabilities cap = new DesiredCapabilities();
                    cap.setBrowserName("chrome");
                    DriverManager.setDriver(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap));
                }
                DriverManager.setDriver(new ChromeDriver());
            }

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
