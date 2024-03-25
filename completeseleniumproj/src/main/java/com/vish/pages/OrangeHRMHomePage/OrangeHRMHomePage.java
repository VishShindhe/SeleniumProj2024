package com.vish.pages.OrangeHRMHomePage;

import com.vish.driver.DriverManager;
import com.vish.pages.OrangeHRMLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangeHRMHomePage {

    private final By accountDropdown = By.className("oxd-userdropdown-name");
    private final By logoutLink = By.linkText("Logout");   //By.className("oxd-userdropdown-link");

    public OrangeHRMHomePage clickAccount(){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(accountDropdown));
        DriverManager.getDriver().findElement(accountDropdown).click();
        return this;
    }

    public OrangeHRMLoginPage clickLogout(){
        DriverManager.getDriver().findElement(logoutLink).click();
        return new OrangeHRMLoginPage();
    }
}
