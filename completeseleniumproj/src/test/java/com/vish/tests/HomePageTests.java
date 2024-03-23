package com.vish.tests;

import com.vish.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.vish.driver.Driver;

public final class HomePageTests extends BaseTest{

    private HomePageTests(){

    }

    @Test
    public void test3(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Java");
        DriverManager.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

}
