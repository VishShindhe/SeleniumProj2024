package com.vish.pages.OrangeHRMHomePage;

import com.vish.driver.DriverManager;
import com.vish.pages.OrangeHRMLoginPage;
import org.openqa.selenium.By;

public class OrangeHRMHomePage {

    private final By dropdown_Account = By.className("oxd-userdropdown-name");
    private final By link_Logout = By.linkText("Logout");   //By.className("oxd-userdropdown-link");

    public OrangeHRMHomePage clickAccount(){
        DriverManager.getDriver().findElement(dropdown_Account).click();
        return this;
    }

    public OrangeHRMLoginPage clickLogout(){
        DriverManager.getDriver().findElement(link_Logout).click();
        return new OrangeHRMLoginPage();
    }
}
