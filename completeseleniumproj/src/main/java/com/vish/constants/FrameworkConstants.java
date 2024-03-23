package com.vish.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String FIREFOXDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/geckodriver";

    public static String getFirefoxDriverPath(){
        return FIREFOXDRIVERPATH;
    }

}
