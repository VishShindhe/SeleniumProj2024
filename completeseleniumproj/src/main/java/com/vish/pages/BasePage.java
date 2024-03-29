package com.vish.pages;

import com.vish.driver.DriverManager;
import com.vish.enums.WaitStrategy;
import com.vish.factories.ExplicitWaitFactory;
import com.vish.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected void click(By by, WaitStrategy waitStrategy, String elementName) {
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.click();
        ExtentLogger.pass(elementName+" is clicked");
    }

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy, String elementName) {
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.sendKeys(value);
        ExtentLogger.pass(value +" is successfully entered in "+elementName);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

}
