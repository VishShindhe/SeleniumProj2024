package com.vish.pages;

import com.vish.enums.WaitStrategy;
import com.vish.reports.ExtentManager;
import com.vish.reports.ExtentReport;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage {

    private final By usernameTextbox = By.xpath("//input[@name='username']");
    private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");



    public OrangeHRMLoginPage enterUserName(String username){
        sendKeys(usernameTextbox,username, WaitStrategy.PRESENCE);
        ExtentManager.getExtentTest().pass("Entered username "+username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        sendKeys(passwordTextbox, password,WaitStrategy.PRESENCE);
        ExtentManager.getExtentTest().pass("Entered password "+password);
        return this;
    }

    public OrangeHRMHomePage clickLogin() {
        click(loginButton, WaitStrategy.CLICKABLE);
        ExtentManager.getExtentTest().pass("Clicked Login ");
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }
}
