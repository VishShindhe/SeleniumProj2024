package com.vish.tests;

import com.vish.pages.OrangeHRMLoginPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

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
