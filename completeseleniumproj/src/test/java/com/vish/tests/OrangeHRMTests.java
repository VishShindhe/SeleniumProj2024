package com.vish.tests;

import com.vish.pages.OrangeHRMLoginPage;
import com.vish.reports.ExtentReport;
import com.vish.utils.DataProviderUtils;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public final class OrangeHRMTests extends BaseTest{

    private OrangeHRMTests(){}

    @Test(dataProvider = "getData", dataProviderClass= DataProviderUtils.class)
    public void loginLogoutTest(Map<String,String> data) throws Exception {
        String title = new OrangeHRMLoginPage()
                .enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
                .clickAccount().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");

    }

    @Test(dataProvider = "getData", dataProviderClass= DataProviderUtils.class)
    public void newTest(Map<String,String> data) throws Exception {

        String title = new OrangeHRMLoginPage()
                .enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
                .clickAccount().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");

    }


}
