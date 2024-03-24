package com.vish.tests;

import com.vish.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vish.driver.Driver;

import java.util.Objects;
import java.util.List;


public final class HomePageTests extends BaseTest{

    private HomePageTests(){

    }

    @Test
    public void test3(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube");
        //DriverManager.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
        String title = DriverManager.getDriver().getTitle();
        Assert.assertTrue(Objects.nonNull(title), "Title is null");
        System.out.println(title);
        Assert.assertTrue(title.toLowerCase().contains("google"));
        //Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"google"));
        Assert.assertTrue(title.length() > 5);
        Assert.assertTrue(title.length() < 100);
        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
        System.out.println(elements.size());
        //Assert.assertEquals(elements.size(), 10);
    }

}
