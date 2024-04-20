package com.vish.pages;

import com.vish.enums.WaitStrategy;
import com.vish.utils.DynamicXPathUtils;
import org.openqa.selenium.By;

public final class AmazonHamburgerMenuPage extends BasePage{

    //Copy
    private final String linkComputers = "//div[text()='Mobiles, Computers']/parent::a";
    private final String linkSubMenu = "//a[text()='%s']";
    private final String linkSubMenu2 = "//div[text()='%s']/parent::a[text()='%s']";

    public AmazonHamburgerMenuPage clickComputer() throws Exception{
        click(By.xpath(linkComputers), WaitStrategy.CLICKABLE, "Mobiles and Computers");
        return this;
    }

    public AmazonLaptopPage clickOnSubMenuItem(String menutext) throws Exception{
        String newxpath = DynamicXPathUtils.getXpath(linkSubMenu, menutext);
        click(By.xpath(newxpath), WaitStrategy.CLICKABLE, menutext);
        if(menutext.contains("Laptops")) {
            return new AmazonLaptopPage();
        }
        return null;
    }

    /*@FindBy(xpath="//div[text()='Mobiles, Computers']/parent::a")
    private WebElement linkMobileAndComputers;

    @FindBy(xpath="//a[text()='Laptops']")
    private WebElement linkLaptops;

    @FindBy(xpath="//a[text()='Drives & Storage']")
    private WebElement linkDrivesAndStorage;

    public AmazonHamburgerMenuPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public AmazonHamburgerMenuPage clickMobilesAndComputers() {
        linkMobileAndComputers.click();
        return this;
    }

    public AmazonLaptopPage clickLaptops() {
        linkLaptops.click();
        return new AmazonLaptopPage();
    }
    public AmazonHamburgerMenuPage clickDrivesAndStorage() {
        linkDrivesAndStorage.click();
        return this;
    }

    private String linkComputers = "//div[text()='Mobiles, Computers']/parent::a";
    private String linkSubMenu = "//a[text()='%replaceable%']";

    public AmazonHamburgerMenuPage clickComputer() throws Exception{
        click(By.xpath(linkComputers), WaitStrategy.CLICKABLE, "Mobiles and Computers");
        return this;
    }

    /*public AmazonMobileComputerPage clickComputer() throws Exception{
        click(By.xpath(linkComputers), WaitStrategy.CLICKABLE, "Mobiles, Computers");
        return new AmazonMobileComputerPage();
    }*  /


    public AmazonLaptopPage clickOnSubMenuItem (String menutext) throws  Exception{
        String newxpath = DynamicXPathUtils.getXpath(linkSubMenu,menutext);
        click(By.xpath(newxpath), WaitStrategy.VISIBLE, menutext);
        if(menutext.contains("Laptops")){
            return new AmazonLaptopPage();
        }
        else
            return null;
    }*/

}
