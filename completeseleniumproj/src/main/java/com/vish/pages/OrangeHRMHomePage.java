package com.vish.pages;

import com.vish.enums.WaitStrategy;
import org.openqa.selenium.By;

public class OrangeHRMHomePage extends BasePage{

    private final By accountDropdown = By.className("oxd-userdropdown-name");
    private final By logoutLink = By.linkText("Logout");

    public OrangeHRMHomePage clickAccount(){
        click(accountDropdown, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMLoginPage clickLogout(){
        click(logoutLink,WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }
}
