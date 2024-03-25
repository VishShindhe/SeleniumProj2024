package com.vish.pages;

import com.vish.driver.DriverManager;
import com.vish.pages.OrangeHRMHomePage.OrangeHRMHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class OrangeHRMLoginPage{

    private final By usernameTextbox = By.xpath("//input[@name='username']");
    private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public OrangeHRMLoginPage enterUserName(String username){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(usernameTextbox));
        DriverManager.getDriver().findElement(usernameTextbox).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        DriverManager.getDriver().findElement(passwordTextbox).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLogin() {
        DriverManager.getDriver().findElement(loginButton).click();
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return DriverManager.getDriver().getTitle();
    }
}
