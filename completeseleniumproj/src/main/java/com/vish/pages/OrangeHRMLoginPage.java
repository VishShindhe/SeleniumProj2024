package com.vish.pages;

import com.vish.enums.WaitStrategy;
import com.vish.reports.ExtentLogger;
import com.vish.reports.ExtentManager;
import com.vish.reports.ExtentReport;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

    private final By usernameTextbox = By.xpath("//input[@name='username']");
    private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");



    public OrangeHRMLoginPage enterUserName(String username) throws Exception {
        sendKeys(usernameTextbox,username, WaitStrategy.PRESENCE, "Username");
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password) throws Exception {
        sendKeys(passwordTextbox, password,WaitStrategy.PRESENCE, "Password");
        return this;
    }

    public OrangeHRMHomePage clickLogin() throws Exception {
        click(loginButton, WaitStrategy.CLICKABLE, "Login Button");
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }
}
