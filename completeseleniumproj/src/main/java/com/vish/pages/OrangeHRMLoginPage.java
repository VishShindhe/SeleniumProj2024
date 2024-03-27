package com.vish.pages;

import com.vish.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage{

    private final By usernameTextbox = By.xpath("//input[@name='username']");
    private final By passwordTextbox = By.xpath("//input[@name='password' and @type='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public OrangeHRMLoginPage enterUserName(String username){
        sendKeys(usernameTextbox,username, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        sendKeys(passwordTextbox, password,WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMHomePage clickLogin() {
        click(loginButton, WaitStrategy.CLICKABLE);
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return getPageTitle();
    }
}
