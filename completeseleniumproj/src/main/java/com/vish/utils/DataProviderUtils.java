package com.vish.utils;

import com.vish.constants.FrameworkConstants;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public final class DataProviderUtils {

    private static List<Map<String,String>> list = new ArrayList<>();

    @DataProvider
    public static Object[] getData(Method method){
        String testname = method.getName();

        if(list.isEmpty()) {
            list = ExcelUtils.getTestDetails(FrameworkConstants.getIterationDataSheet());
        }

        List<Map<String, String>> smallList = new ArrayList<>();
        //Predicate<Map<String,String>> isTestNameNotMatching = map ->!map.get("testname").equalsIgnoreCase(testname);
        //Predicate<Map<String,String>> isExecuteColumnNo = map -> map.get("execute").equalsIgnoreCase("no");

        //smallList.removeIf(isTestNameNotMatching.or(isExecuteColumnNo));
        //return smallList.toArray();
        for(int i=0;i<list.size();i++){
            if(list.get(i).get("testname").equalsIgnoreCase(testname) && (list.get(i).get("execute").equalsIgnoreCase("yes"))) {
                    smallList.add(list.get(i));

            }
        }
        return smallList.toArray();
    }
}
