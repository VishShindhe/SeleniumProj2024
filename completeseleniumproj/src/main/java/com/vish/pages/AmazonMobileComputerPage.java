package com.vish.pages;

import com.vish.enums.WaitStrategy;
import com.vish.utils.DynamicXPathUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public final class AmazonMobileComputerPage extends BasePage{

    private String linkLaptops = "//a[text()='Laptops']";

   /* @FindBy(xpath="//a[text()='Laptops']")
    private WebElement linkLaptops;*/

    public AmazonLaptopPage clickLaptops() throws  Exception{
        //String newxpath = DynamicXPathUtils.getXpath(linkLaptops,menutext);
        click(By.xpath(linkLaptops), WaitStrategy.CLICKABLE, "Laptops");
        //click(By.xpath(linkLaptops), WaitStrategy.CLICKABLE, menutext);
        //linkLaptops.click();
        return new AmazonLaptopPage();
    }
}
