package com.vish.utils;

import com.vish.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile() { }

    private static final Properties property = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();
    static {
        try {
            FileInputStream file = new FileInputStream(FrameworkConstants.getConfigFilePath());
            property.load(file);

            for(Map.Entry<Object,Object> entry: property.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) throws Exception {
        if(Objects.isNull(CONFIGMAP.get(key)) || Objects.isNull(key)) {
            throw new Exception("Property name " + key +" is not found");
        }
        return CONFIGMAP.get(key);
    }
}
