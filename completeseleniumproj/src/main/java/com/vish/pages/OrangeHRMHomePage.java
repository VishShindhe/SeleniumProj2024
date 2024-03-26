package com.vish.pages;

import com.vish.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMHomePage extends BasePage{

    private final By accountDropdown = By.className("oxd-userdropdown-name");
    private final By logoutLink = By.linkText("Logout");

    public OrangeHRMHomePage clickAccount(){
        click(accountDropdown,"presence");
        return this;
    }

    public OrangeHRMLoginPage clickLogout(){
        click(logoutLink,"clickable");
        return new OrangeHRMLoginPage();
    }
}
