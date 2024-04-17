package com.vish.tests;

import com.vish.pages.AmazonHomePage;
import com.vish.pages.BasePage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;

public final class AmazonDemoTest extends BasePage {

    private AmazonDemoTest() {}

    @Test
    public void amazonTest(Map<String,String> data) throws Exception{

            //String title =
                    new AmazonHomePage()
                            .clickBestSellers();
                            //.clickHamburger();
                    //.clickComputer()
                    //.clickOnSubMenuItem(data.get("menutext")).getTitle();
            //Assertions.assertThat(title).isNotNull();
        }

        /*String title =
                new AmazonHomePage()
                        //.clickPageTitle()
                .clickHamburger();
               // .clickComputer()
               // .clickOnSubMenuItem("Laptops")
              //  .getTitle();


        //Assertions.assertThat(title).isNotBlank().isNotNull();
        /* String title =
                new AmazonHomePage()
                .clickPageTitle()
                .clickHamburger()
               .clickComputer()
                .clickLaptops();
                */


}
