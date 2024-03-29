package com.vish.pages;

import com.vish.enums.WaitStrategy;
import com.vish.reports.ExtentLogger;
import org.openqa.selenium.By;

public class OrangeHRMHomePage extends BasePage {

    private final By accountDropdown = By.className("oxd-userdropdown-name");
    private final By logoutLink = By.linkText("Logout");

    public OrangeHRMHomePage clickAccount() throws Exception {
        click(accountDropdown, WaitStrategy.PRESENCE, "Account Link");

        return this;
    }

    public OrangeHRMLoginPage clickLogout() throws Exception {
        click(logoutLink,WaitStrategy.CLICKABLE, "Logout button");
        ExtentLogger.pass("Logout clicked");
        return new OrangeHRMLoginPage();
    }
}
