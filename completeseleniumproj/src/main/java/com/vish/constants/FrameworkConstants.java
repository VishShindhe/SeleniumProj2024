package com.vish.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
    private static final String FIREFOXDRIVERPATH = RESOURCESPATH+"/executables/geckodriver";
    private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";

    private static final int EXPLICITWAIT = 20;

    public static String getFirefoxDriverPath(){
        return FIREFOXDRIVERPATH;
    }

    public static String getConfigFilePath(){
        return CONFIGFILEPATH;
    }

    public static int getExplicitWait(){
        return EXPLICITWAIT;
    }

}
