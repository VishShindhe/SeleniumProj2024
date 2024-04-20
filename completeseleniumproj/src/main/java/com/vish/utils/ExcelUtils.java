package com.vish.utils;

import com.vish.constants.FrameworkConstants;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public final class ExcelUtils {

    private ExcelUtils(){}

    /*Copy
    public static List<Map<String,String>> getTestDetails(String sheetname){
        List<Map<String,String>> list = null;

        try(FileInputStream fs = new FileInputStream(FrameworkConstants.getExcelPath())) {

            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet(sheetname);

            int lastrownum = sheet.getLastRowNum();
            int lastcolnum = sheet.getRow(0).getLastCellNum();

            Map<String,String> map =null;
            list = new ArrayList<>();

            for(int i=1; i<=lastrownum;i++) {
                map = new HashMap<>();
                for(int j=0;j<lastcolnum;j++) {
                    String key= sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key, value);
                }
                list.add(map);
            }

        }catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }
*/
    public static List<Map<String,String>> getTestDetails(String sheetName){

        List<Map<String,String>> list = null;
        //FileInputStream fs = null;
        try(FileInputStream fs = new FileInputStream(FrameworkConstants.getExcelPath())) {

            //fs = new FileInputStream(FrameworkConstants.getExcelPath());
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            System.out.println(sheetName);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            Map<String,String> map = null;
            list = new ArrayList<>();
            int lastRowNum = sheet.getLastRowNum();
            int lastColNum = sheet.getRow(0).getLastCellNum();

            for(int i = 1; i<=lastRowNum; i++){
                map = new HashMap<>();
                for(int j = 0; j < lastColNum; j++){
                    String key = sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key, value);
                }
                list.add(map);
            }
        }
        catch (FileNotFoundException e1) {
        e1.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
