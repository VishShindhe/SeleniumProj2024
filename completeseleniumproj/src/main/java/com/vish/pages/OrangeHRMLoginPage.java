package com.vish.pages;

import com.vish.driver.DriverManager;
import com.vish.pages.OrangeHRMHomePage.OrangeHRMHomePage;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage{

    private final By textbox_username = By.xpath("//input[@name='username']");
    private final By textbox_password = By.xpath("//input[@name='password' and @type='password']");
    private final By button_login = By.xpath("//button[@type='submit']");

    public OrangeHRMLoginPage enterUserName(String username){
        DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLogin() {
        DriverManager.getDriver().findElement(button_login).click();
        return new OrangeHRMHomePage();
    }

    public String getTitle() {
        return DriverManager.getDriver().getTitle();
    }
}
