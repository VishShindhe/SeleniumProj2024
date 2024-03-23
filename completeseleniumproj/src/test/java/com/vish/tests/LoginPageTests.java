package com.vish.tests;

import com.vish.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.vish.driver.Driver;

public final class LoginPageTests extends BaseTest{

    private LoginPageTests(){

    }

    @Test
    public void test2(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium");
        DriverManager.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

}
