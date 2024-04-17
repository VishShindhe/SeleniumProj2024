package com.vish.pages;

import com.vish.driver.DriverManager;
import com.vish.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class AmazonHomePage extends BasePage{

    //Copy
   // @FindBy(xpath="//*[@id='nav-hamburger-menu']")

    private WebElement linkHamburger;

    private String linkBestSellers = "//div[text()='Mobiles, Computers']/parent::a";
    

    /**
     * Constructor to initialise the page factory elements. It is not recommended to use page factory
     * This is an sample for demonstration purpose
     */
    public AmazonHomePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

   /* public AmazonHamburgerMenuPage clickHamburger() {
        System.out.println(linkHamburger.getText());
        linkHamburger.click();
        return new AmazonHamburgerMenuPage();
    }*/

    public void clickBestSellers() throws Exception{
        click(By.xpath(linkBestSellers), WaitStrategy.PRESENCE, "Best Sellers");
        //return AmazonHamburgerMenuPage;
    }

   /* @FindBy(id="nav-hamburger-menu")
    private WebElement linkHamburger;*  /
    @FindBy(id="searchDropdownBox")
    private WebElement pageTitle;

    private String linkHamburger = "//a[@id='nav-hamburger-menu']";
    public AmazonHomePage() throws InterruptedException{
        PageFactory.initElements(DriverManager.getDriver(), this);
        Thread.sleep(5000);
    }

    public AmazonHomePage clickPageTitle() throws InterruptedException{
        Thread.sleep(5000);
        //pageTitle.click();
        return this;
    }

    public AmazonHamburgerMenuPage clickHamburger() throws Exception {
        Thread.sleep(5000);
        click(By.xpath(linkHamburger), WaitStrategy.CLICKABLE, "All");
        //linkHamburger.click();
        return new AmazonHamburgerMenuPage();
    }*/
}
