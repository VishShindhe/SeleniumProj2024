package com.vish.tests;

import com.vish.driver.DriverManager;
import com.vish.pages.OrangeHRMHomePage.OrangeHRMHomePage;
import com.vish.pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test
    public void loginLogoutTest() throws InterruptedException{
        OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
        OrangeHRMHomePage ohhp = new OrangeHRMHomePage();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ohhp = ohlp.enterUserName("Admin").enterPassword("admin123").clickLogin();
        ohlp = ohhp.clickAccount().clickLogout();

    }
}
