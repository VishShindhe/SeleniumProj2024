package com.vish.tests;

import com.vish.driver.DriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vish.driver.Driver;

import java.util.Objects;
import java.util.List;
import static org.assertj.core.api.Assertions.*;


public final class HomePageTests extends BaseTest{

    private HomePageTests(){

    }

    @Test
    public void test3() throws InterruptedException{
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube");
        DriverManager.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
        String title = DriverManager.getDriver().getTitle();

        assertThat(title)
                        .isNotNull()
                        .containsIgnoringCase("google")
                        .hasSizeBetween(5,100);

        System.out.println("Title is "+title);
        List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));

        for(WebElement we : elements){
            System.out.println(we.getText());
        }

        assertThat(elements)
                        //.hasSize(10)
                                .extracting(WebElement :: getText)
                                        .contains("Testing Mini Bytes");
        System.out.println("Size is "+elements.size());
        //Assert.assertEquals(elements.size(), 9);
    }

}
