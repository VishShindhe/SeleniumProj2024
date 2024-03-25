package com.vish.tests;

import com.vish.driver.DriverManager;
import com.vish.pages.OrangeHRMHomePage.OrangeHRMHomePage;
import com.vish.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test
    public void loginLogoutTest() throws InterruptedException{

        String title = new OrangeHRMLoginPage()
                .enterUserName("Admin").enterPassword("admin123").clickLogin()
                .clickAccount().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");

    }
}