package com.vish.pages;

import com.vish.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class OrangeHRMLoginPage extends BasePage{

    private final By usernameTextbox = By.xpath("//input[@name='username']");
    private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public OrangeHRMLoginPage enterUserName(String username){
        sendKeys(usernameTextbox,username,"presence");
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        sendKeys(passwordTextbox, password,"presence");
        return this;
    }

    public OrangeHRMHomePage clickLogin() {
        click(loginButton, "clickable");
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }
}
