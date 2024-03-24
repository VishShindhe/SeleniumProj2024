package com.vish.examples;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class AssertJSoftAssertion {

    @Test
    public void assertSoftlyTest() {
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat("Hello World")
                .isNotEmpty()
                .hasSize(5)
                .contains("Hello");
        System.out.println("Hi");
        softly.assertAll();
    }
}
