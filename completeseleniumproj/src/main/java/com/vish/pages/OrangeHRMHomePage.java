package com.vish.pages;

import com.vish.enums.WaitStrategy;
import com.vish.reports.ExtentManager;
import com.vish.reports.ExtentReport;
import org.openqa.selenium.By;

public class OrangeHRMHomePage extends BasePage {

    private final By accountDropdown = By.className("oxd-userdropdown-name");
    private final By logoutLink = By.linkText("Logout");

    public OrangeHRMHomePage clickAccount(){
        click(accountDropdown, WaitStrategy.PRESENCE);
        ExtentManager.getExtentTest().pass("Account clicked");
        return this;
    }

    public OrangeHRMLoginPage clickLogout(){
        click(logoutLink,WaitStrategy.CLICKABLE);
        ExtentManager.getExtentTest().pass("Logout clicked");
        return new OrangeHRMLoginPage();
    }
}
