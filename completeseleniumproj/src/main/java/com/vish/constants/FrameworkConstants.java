package com.vish.constants;

import com.vish.enums.ConfigProperties;
import com.vish.utils.PropertyUtils;

public final class FrameworkConstants {

    private FrameworkConstants(){

    }
    private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
    private static final String FIREFOXDRIVERPATH = RESOURCESPATH+"/executables/geckodriver";
    private static final String EXCELPATH  = RESOURCESPATH+"/excel/testdata.xlsx";
    private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";
    private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/extent-test-output/";
    private static final String RUNMANAGERSHEET = "RUNMANAGER";
    private static final String ITERATIONDATASHEET = "DATA";

    private static  String EXTENTREPORTFILEPATH = "";

    private static final int EXPLICITWAIT = 20;

    public static String getFirefoxDriverPath(){
        return FIREFOXDRIVERPATH;
    }

    public static String getConfigFilePath(){
        return CONFIGFILEPATH;
    }

    public static String getRunManagerSheet(){
        return RUNMANAGERSHEET;
    }

    public static String getIterationDataSheet(){
        return ITERATIONDATASHEET;
    }

    public static String getExcelPath(){
        return EXCELPATH;
    }

    public static String getExtentReportFilePath() throws Exception{
        if(EXTENTREPORTFILEPATH.isEmpty()){
            EXTENTREPORTFILEPATH = createReportPath();
        }
        return EXTENTREPORTFILEPATH;
    }

    private static String createReportPath() throws Exception{
        if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
            return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
        }
        else {
            return EXTENTREPORTFOLDERPATH+"index.html";
        }
    }


    public static int getExplicitWait(){
        return EXPLICITWAIT;
    }

}
