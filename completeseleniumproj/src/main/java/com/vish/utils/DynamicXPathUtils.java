package com.vish.utils;

public final class DynamicXPathUtils {
    private DynamicXPathUtils() {}

    public static String getXpath(String xpath, String value) {

        return String.format(xpath, value);

        //return xpath.replace("%replaceable%", value);
    }
}

