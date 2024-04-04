package com.vish.tests;

import com.vish.pages.OrangeHRMLoginPage;
import com.vish.reports.ExtentReport;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test(dataProvider = "LoginTestDataProvider")
    public void loginLogoutTest(String username, String password) throws Exception {
        String title = new OrangeHRMLoginPage()
                .enterUserName(username).enterPassword(password).clickLogin()
                .clickAccount().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");

    }

    @Test(dataProvider = "LoginTestDataProvider")
    public void newTest(String username, String password) throws Exception {

        String title = new OrangeHRMLoginPage()
                .enterUserName(username).enterPassword(password).clickLogin()
                .clickAccount().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");

    }

    @DataProvider(name="LoginTestDataProvider",parallel = true)
    public Object[][] getData(){
        return new Object[][] {
                {"Admin", "admin123"},
                /*{"Admin111", "admin123"},
                {"Admin222", "admin123"},
                 {"Admin333", "admin123"}*/
        };
    }


}
